package org.design.simple.factory;


import org.design.simple.factory.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 14:56
 * 简单工厂定义：定义一个工厂类，可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类
 **/
public class ClientMain {



    public static void main(String[] args) {
        IOperator operator = SimpleFactory.createOperator("+");

        System.out.println("result = " + operator.getResult(15,89));
    }





}
