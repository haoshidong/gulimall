package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hsd
 * @email hsd@gmail.com
 * @date 2022-11-29 11:13:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
