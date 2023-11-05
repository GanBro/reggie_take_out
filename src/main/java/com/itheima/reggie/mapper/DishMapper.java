package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {

    @Update("update dish set status = #{b} where id = #{ids}")
    void updateStatus(Long ids, Integer b);
}
