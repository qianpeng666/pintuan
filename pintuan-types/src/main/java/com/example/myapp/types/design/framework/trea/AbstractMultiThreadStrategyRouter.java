package com.example.myapp.types.design.framework.trea;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractMultiThreadStrategyRouter<T,D,R> implements StrategyHandler<T,D,R>,StrategyMapper<T,D,R>{

    @Getter
    @Setter
    protected  StrategyHandler<T, D, R> defaultStrategyHandler=StrategyHandler.DEFAULT;


    public  R router(T requestParameter,D dynamicContext) throws  Exception{
        StrategyHandler<T,D,R> strategyHandler=get (requestParameter,dynamicContext);
        if (null !=strategyHandler) return strategyHandler.apply(requestParameter,dynamicContext);
        return defaultStrategyHandler.apply(requestParameter,dynamicContext);
    }

    @Override
    public R apply(T requestParameter, D dynamicContext) throws Exception {
        mutiThread(requestParameter,dynamicContext);
        return doapply(requestParameter,dynamicContext);
    }
    protected abstract void mutiThread(T requestParameter, D dynamicContext) throws Exception;

    protected abstract R doapply(T requestParameter, D dynamicContext) throws Exception;

}
