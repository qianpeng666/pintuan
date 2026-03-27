package com.example.myapp.domain.activity.service.trial.node;

import com.alibaba.fastjson.JSON;
import com.example.myapp.domain.activity.model.entity.MarketProductEntity;
import com.example.myapp.domain.activity.model.entity.TrialBalanceEntity;
import com.example.myapp.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.example.myapp.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.example.myapp.types.design.framework.trea.StrategyHandler;
import com.example.myapp.types.enums.ResponseCode;
import com.example.myapp.types.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class RootNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext,TrialBalanceEntity> {

    @Resource
    private SwitchRoot switchRoot;
    @Override
    public TrialBalanceEntity doapply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        log.info("拼团商品查询试算服务-RootNode userId:{} requestParameter:{}", requestParameter.getUserId(), JSON.toJSONString(requestParameter));
        if(StringUtils.isBlank(requestParameter.getUserId()) ||
        StringUtils.isBlank(requestParameter.getGoodsId())||
        StringUtils.isBlank(requestParameter.getSource())||
        StringUtils.isBlank(requestParameter.getChannel())){
            throw new AppException(ResponseCode.ILLEGAL_PARAMETER.getCode(),ResponseCode.ILLEGAL_PARAMETER.getInfo());
        }
        return router(requestParameter,dynamicContext);
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext){
        return switchRoot;
    }
}
