package com.example.myapp.domain.activity.service;

import com.example.myapp.domain.activity.model.entity.MarketProductEntity;
import com.example.myapp.domain.activity.model.entity.TrialBalanceEntity;

public interface IIndexGroupBuyMarketService {

    TrialBalanceEntity indexMarketTrail(MarketProductEntity marketProductEntity) throws Exception;
}
