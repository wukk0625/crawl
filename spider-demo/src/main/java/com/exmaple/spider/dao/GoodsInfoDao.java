package com.exmaple.spider.dao;

import java.util.List;

import com.exmaple.spider.entity.GoodsInfo;

/**
 * 商品Dao层
 * @author ZGJ
 * @date 2017年7月15日
 */
public interface GoodsInfoDao {
    /**
     * 插入商品信息
     * @param infos
     */
    void saveBatch(List<GoodsInfo> infos);
}
