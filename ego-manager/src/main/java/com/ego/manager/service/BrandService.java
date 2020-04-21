package com.ego.manager.service;

import com.ego.manager.pojo.Brand;

import java.util.List;

/**
 * @author Wang
 */
public interface BrandService {

    /**
     *     查询所有品牌
     */
    List<Brand> selectList();
}
