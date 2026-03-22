package com.example.myapp.domain.activity.service.trial.factory;

import com.example.myapp.domain.activity.model.entity.MarketProductEntity;
import com.example.myapp.domain.activity.model.entity.TrialBalanceEntity;
import com.example.myapp.domain.activity.service.trial.node.RootNode;
import com.example.myapp.types.design.framework.trea.StrategyHandler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class DefaultActivityStrategyFactory {

    private final RootNode rootNode;

    public DefaultActivityStrategyFactory(RootNode rootNode){
        this.rootNode = rootNode;
    }

    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler(){
        return rootNode;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DynamicContext{

    }

}
