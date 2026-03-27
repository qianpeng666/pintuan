package com.example.myapp.domain.activity.service.trial.node;

import com.alibaba.fastjson.JSON;
import com.example.myapp.domain.activity.model.entity.MarketProductEntity;
import com.example.myapp.domain.activity.model.entity.TrialBalanceEntity;
import com.example.myapp.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.example.myapp.domain.activity.model.valobj.SkuVO;
import com.example.myapp.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.example.myapp.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.example.myapp.types.design.framework.trea.StrategyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Slf4j
@Service
public class EndNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    @Override
    public TrialBalanceEntity doapply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        log.info("拼团商品查询试算服务-EndNode userId:{} requestParameter:{}", requestParameter.getUserId(), JSON.toJSONString(requestParameter));
        GroupBuyActivityDiscountVO groupBuyActivityDiscountVO =dynamicContext.getGroupBuyActivityDiscountVO();
        SkuVO skuVO=dynamicContext.getSkuVO();
        return TrialBalanceEntity.builder()
                .goodsId(skuVO.getGoodsId())
                .goodsName(skuVO.getGoodsName())
                .originalPrice(skuVO.getOriginalPrice())
                .deductionPrice(new BigDecimal("0.00"))
                .targetCount(groupBuyActivityDiscountVO.getTarget())
                .startTime(groupBuyActivityDiscountVO.getStartTime())
                .endTime(groupBuyActivityDiscountVO.getEndTime())
                .isVisible(false)
                .isEnable(false)
                .build();
    }


    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        return defaultStrategyHandler;
    }
}
