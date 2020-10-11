package org.design.decorator;

import org.design.decorator.interfaces.IComponent;


/*
* 具体构件（Concrete Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
* */
public class ConcreteComponent implements IComponent {

    @Override
    public void operation() {
        System.out.println("具体构件（Concrete Component）角色,operation called..");
    }
}
