package com.ego.manager.service;

import com.ego.common.result.BaseResult;
import com.ego.manager.pojo.GoodsCategory;
import com.ego.manager.vo.GoodsCategoryVo;

import java.util.List;

public interface GoodsCategroyService {

    /**
     * 查询所有顶级分类
     * @return List<GoodsCategory>
     */
    List<GoodsCategory> selectTopList();


    /**
     * 通过父类id查询所有分类
     * @param id
     * @return
     */
    List<GoodsCategory> selectListByParentId(Short id);

    /**
     * 保存
     * @return
     */
    BaseResult save(GoodsCategory goodsCategory);

    /**
     * 查询类别列表
     * @return
     */
    List<GoodsCategoryVo> selectAllList();
}
