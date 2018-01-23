package com.exmaple.spider.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exmaple.spider.dao.GoodsInfoDao;
import com.exmaple.spider.entity.GoodsInfo;

@Repository
public class GoodsInfoDaoImpl implements GoodsInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveBatch(List<GoodsInfo> infos) {
        String sql = "REPLACE INTO goods_info(" + "goods_id," + "goods_name," + "goods_price," + "img_url) "
                + "VALUES(?,?,?,?)";
        for(GoodsInfo info : infos) {
            jdbcTemplate.update(sql, info.getGoodsId(), info.getGoodsName(), info.getGoodsPrice(), info.getImgUrl());
        }
    }
}
