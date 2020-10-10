package org.design.strategy;

import org.design.strategy.interfaces.Strategy;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:23
 **/
public class ContextStrategy {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextStrategyMethod(){
        System.out.println("contextStrategyMethod method called");
        strategy.strategyMethod();
    }
}
