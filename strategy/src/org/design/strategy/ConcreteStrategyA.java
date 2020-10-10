package org.design.strategy;

import org.design.strategy.interfaces.Strategy;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:11
 * 具体策略类A：实现了抽象策略定义的接口，提供具体的算法实现。
 * ConcreteStrategyA
 * ConcrerteStrategyB
 **/
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("ConcreteStrategyA method called");
    }
}
