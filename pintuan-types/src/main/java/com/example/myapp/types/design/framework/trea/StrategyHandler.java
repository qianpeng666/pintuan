package com.example.myapp.types.design.framework.trea;

/**
 * 策略处理器
 */
public interface StrategyHandler<T,D,R>{

    StrategyHandler DEFAULT =(T,D)->null;

    R apply(T requestParameter,D dynamicContext) throws Exception;
}
