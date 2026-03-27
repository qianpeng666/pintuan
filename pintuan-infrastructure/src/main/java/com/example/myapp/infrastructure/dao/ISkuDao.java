package com.example.myapp.infrastructure.dao;

import com.example.myapp.infrastructure.dao.po.Sku;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISkuDao {

    Sku querySkuByGoodsId(String goodsId);
}
