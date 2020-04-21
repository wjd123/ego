package com.ego.manager.service.impl;

import com.ego.manager.mapper.BrandMapper;
import com.ego.manager.pojo.Brand;
import com.ego.manager.pojo.BrandExample;
import com.ego.manager.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品Service实现类
 *
 * @author : wangjd
 * @version : 1.0.0
 * @date : 2020-04-21 21:49
 **/
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> selectList() {
        return brandMapper.selectByExample(new BrandExample());
    }
}
