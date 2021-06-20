package com.supergo.manager.service.Impl;


import com.supergo.http.HttpResult;
import com.supergo.manager.service.ItemCatService;
import com.supergo.mapper.ItemcatMapper;
import com.supergo.pojo.Itemcat;
import com.supergo.service.base.BaseService;
import com.supergo.service.base.impl.BaseServiceImpl;
import com.supergo.user.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ItemCatServiceImpl extends BaseServiceImpl<Itemcat> implements ItemCatService {
    @Autowired
    ItemcatMapper itemcatMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;






    @Override
    public HttpResult getItemcCatList() {
        try {
            String data = redisTemplate.opsForValue().get("item-category");
            if(data!=null&&!"".equals(data)){
                List<Itemcat> itemcats = JsonUtils.jsonToList(data, Itemcat.class);
                return HttpResult.ok(itemcats);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
//        如果缓存中没有数据，就查询数据库
//        将查询到的数据放入缓存，返回数据
        List<Itemcat> itemcats = itemCatgorys(0);
        try {
            redisTemplate.opsForValue().set("item-category",JsonUtils.objectToJson(itemcats));
        }catch (Exception e){
            e.printStackTrace();
        }
        return HttpResult.ok(itemcats);
    }




    public List<Itemcat> itemCatgorys(long parentId){
        Example example=new Example(Itemcat.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("parentId",parentId);
        List<Itemcat> itemcats = itemcatMapper.selectByExample(example);
        if(itemcats==null||itemcats.size()==0){
            return null;
        }
        itemcats.forEach(itemcat -> itemcat.setChildren(itemCatgorys(itemcat.getId())));
        return itemcats;

    }


}
