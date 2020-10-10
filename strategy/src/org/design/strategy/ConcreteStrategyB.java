package org.design.strategy;

import org.design.strategy.interfaces.Strategy;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:20
 * 具体策略类B：实现了抽象策略定义的接口，提供具体的算法实现。
 **/
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {

        System.out.println("ConcreteStrategyB method called");

    }
}
