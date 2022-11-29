package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author hsd
 * @email hsd@gmail.com
 * @date 2022-11-29 11:13:34
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
