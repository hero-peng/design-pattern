package org.design.template.method;

/*
* 模板方法模式的子类
* 具体的实现延迟到子类定义
* */

public class ConcreteClass extends AbstractClass {

    @Override
    public void templateMethod() {
        super.templateMethod();
    }

    @Override
    public void abstractMethod1() {

        System.out.println("子类 abstractMethod1 被调用");

    }

    @Override
    public void abstractMethod2() {
        System.out.println("子类 abstractMethod2 被调用");
    }
}
