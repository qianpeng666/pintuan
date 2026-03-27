package com.example.myapp.domain.activity.service.trial;

import com.example.myapp.domain.activity.adapter.repository.IActivityRepository;
import com.example.myapp.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.example.myapp.types.design.framework.trea.AbstractMultiThreadStrategyRouter;
import com.example.myapp.types.design.framework.trea.AbstractStrategyRouter;

import javax.annotation.Resource;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity,DynamicContext,TrialBalanceEntity> extends AbstractMultiThreadStrategyRouter<MarketProductEntity,DynamicContext,TrialBalanceEntity> {


    protected long timeout =500;

    @Resource
    protected IActivityRepository repository;

    @Override
    protected void mutiThread(MarketProductEntity requestParameter, DynamicContext dynamicContext) throws Exception {

    }
}
