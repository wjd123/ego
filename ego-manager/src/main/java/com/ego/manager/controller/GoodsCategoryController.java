package com.ego.manager.controller;

import com.ego.common.result.BaseResult;
import com.ego.manager.pojo.GoodsCategory;
import com.ego.manager.service.GoodsCategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("category")
public class GoodsCategoryController {

    @Autowired
    private GoodsCategroyService goodsCategroyService ;

    /**
     * 跳转到list页面
     * @return
     */
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("gcvList",goodsCategroyService.selectAllList());
        return "goods/category/category-list";
    }

    /**
     * 跳转到add页面
     * @param model
     * @return
     */
    @RequestMapping("add")
    public String add(Model model){
        model.addAttribute("gcList", goodsCategroyService.selectTopList());
        return "goods/category/category-add";
    }

    /**
     * 根据父类id查询类别
     * @param parentId
     * @return
     */
    @RequestMapping("/{parentId}")
    @ResponseBody
    public List<GoodsCategory> selectListByParentId(@PathVariable Short parentId){

        return goodsCategroyService.selectListByParentId(parentId);
    }

    /**
     * 保存
     * @param goodsCategory
     * @return
     */
    @RequestMapping("save")
    @ResponseBody
    public BaseResult save (GoodsCategory goodsCategory){
        return goodsCategroyService.save(goodsCategory);
    }

}
