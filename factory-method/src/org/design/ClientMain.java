package org.design;

import org.design.interfaces.IFactory;
import org.design.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 14:05
 * 工厂方法模式：定义一个用于创建对接的接口，让子类决定实例化哪一个类。工厂方法是一个类的实例化延迟到子类
 **/
public class ClientMain {

    public static void main(String[] args) {

        /*
        * 客户端需要决定实例化哪个工厂来实例化运算类
        * */
        IFactory factory = new FactoryAdd();
        IOperator operator = factory.createOperator();

        System.out.println( "add result = " + operator.getResult(5,6));


        factory = new FactorySub();
        operator = factory.createOperator();
        System.out.println( "sub result = " + operator.getResult(65,26));
    }

}
