package org.design.decorator;

import org.design.decorator.interfaces.IComponent;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:44
 * 装饰者模式
 * 动态的给一个对象增加额外的职责，就增加功能来来讲，装饰者模式比生成子类更加灵活
 * 指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 * 装饰模式主要包含以下角色。
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 具体构件（Concrete    Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任
 **/
public class DecoratorMain {

    public static void main(String[] args) {

        IComponent p=new ConcreteComponent();
        p.operation();
        System.out.println("-------------------------------------------------------------");

        IComponent d = new ConcreteDecoratorA(p);
        d.operation();
    }

}
