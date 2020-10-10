package org.design.strategy;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 14:37
 * 策略模式客户端
 * 定义：他定义了算法家族，分别封装起来，让他们之间可以互相替换，
 *       此模式让算法的变化，不会影响到使用算法的客户
 * 策略模式的主要角色如下。
 *  抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 *  具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 *  环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 **/
public class ClientMain {

    public static void main(String[] args) {

        ContextStrategy context = new ContextStrategy();
        ConcreteStrategyA strategyA = new ConcreteStrategyA();

        context.setStrategy(strategyA);
        context.contextStrategyMethod();

        System.out.println("*************************");

        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyA);
        context.contextStrategyMethod();



    }

}
