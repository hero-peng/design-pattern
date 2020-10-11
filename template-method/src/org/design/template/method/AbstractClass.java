package org.design.template.method;

/*
* 模板方法模式的父类
* 定义一个算法的骨架，而将一些步骤延续到子类中
* */
public abstract class AbstractClass {

    public void templateMethod() {
        System.out.println("模板方法父类AbstractClass的 templateMethod 方法被调用");

        abstractMethod1();

        abstractMethod2();
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
