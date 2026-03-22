package com.example.myapp.types.design.framework.trea;

/**
 * 策略映射器
 */
public interface StrategyMapper<T,D,R> {

    StrategyHandler<T,D,R> get(T requestParameter,D dynamicContext);
}
