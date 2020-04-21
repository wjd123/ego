package com.ego.manager.controller;

import com.ego.manager.service.BrandService;
import com.ego.manager.service.GoodsCategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品Controller
 *
 * @author : wangjd
 * @version : 1.0.0
 * @date : 2020-04-21 21:35
 **/

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsCategroyService goodsCategroyService;
    @Autowired
    private BrandService brandService;


    @RequestMapping("list")
    public String list(){
        return "goods/goods-list";
    }

    @RequestMapping("add")
    public String addGoods(Model model){


        //查询顶级类别
        model.addAttribute("gcList", goodsCategroyService.selectTopList());

        //查询品牌
        model.addAttribute("brandList", brandService.selectList());

        return "goods/goods-add";
    }

}
