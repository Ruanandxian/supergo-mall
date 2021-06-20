package com.mapper.mapper;

import com.mapper.pojo.Areas;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AreasMapper extends Mapper<Areas> {
    @Select("select * from tb_areas where cityid=#{cityId}")
    List<Areas> findListByCityId(String cityId);
    List<Areas> getListByCityId(String cityId);
}
