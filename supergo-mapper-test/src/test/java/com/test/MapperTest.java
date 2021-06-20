package com.test;

import com.mapper.mapper.AreasMapper;
import com.mapper.pojo.Areas;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.mapper.MapperTest.class)
public class MapperTest {
    @Autowired
    private AreasMapper areasMapper;

    @Test
    public void findById(){
        Areas areas = areasMapper.selectByPrimaryKey(1);
        System.out.println(areas);
    }

    @Test
    public void findAll(){
        List<Areas> areas = areasMapper.selectAll();
        areas.forEach(a-> System.out.println(a));
    }

    @Test
    public void findByExample(){
        Example example=new Example(Areas.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("areaid","110101");
        List<Areas> areas = areasMapper.selectByExample(example);
        areas.forEach(areas1 -> System.out.println(areas1));
    }


    @Test
    public void testfindListByCityId(){
        List<Areas> listByCityId = areasMapper.findListByCityId("110100");
        listByCityId.forEach(areas -> System.out.println(areas));
    }

    @Test
    public void testgetListByCityId() {
        List<Areas> list = areasMapper.getListByCityId("110200");
        list.forEach(a-> System.out.println(a));
    }



}
