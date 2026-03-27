package com.example.myapp.domain.activity.service.trial.thread;

import com.example.myapp.domain.activity.adapter.repository.IActivityRepository;
import com.example.myapp.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.util.concurrent.Callable;

public class QueryGroupBuyActivityDiscountVOThreadTask implements Callable<GroupBuyActivityDiscountVO> {

    private  final String source;
    private  final String channel;
    private  final IActivityRepository repository;

    public QueryGroupBuyActivityDiscountVOThreadTask(String source,String channel,IActivityRepository repository){
        this.source=source;
        this.channel=channel;
        this.repository=repository;
    }


    @Override
    public GroupBuyActivityDiscountVO call() throws Exception {
        return repository.queryGroupBuyActivityDiscountVO(source,channel);
    }
}
