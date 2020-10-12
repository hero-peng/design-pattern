package org.design.adapter;

/*
* 将一个类的接口转换成客户希望的另外一个接口。该模式使得原本不兼容而不能一起
工作的那些类可以一起工作。
适配器模式（Adapter）包含以下主要角色。
1、目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
2、适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
3、适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
* */

public class AdapterMain {

    public static void main(String[] args) {

        Target target = new Adapter();
        target.operation();

    }
}
