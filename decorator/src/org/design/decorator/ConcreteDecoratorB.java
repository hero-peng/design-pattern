package org.design.decorator;


import org.design.decorator.interfaces.IComponent;

/*
* 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
* */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(IComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰（ConcreteDecoratorB）角色,operation called..");
        addFunction();
    }

    public void addFunction(){
        System.out.println("为具体构件ConcreteDecoratorB角色增加额外的功能addFunction()");
    }
}
