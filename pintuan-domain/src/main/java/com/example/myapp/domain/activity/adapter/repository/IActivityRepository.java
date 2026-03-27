package com.example.myapp.domain.activity.adapter.repository;

import com.example.myapp.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.example.myapp.domain.activity.model.valobj.SkuVO;

public interface IActivityRepository {

    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(String source,String channel);

    SkuVO querySkuByGoodsId(String goodsId);



}
