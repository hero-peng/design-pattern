package org.design.decorator;

import org.design.decorator.interfaces.IComponent;

/*
*抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
* */
public class Decorator implements IComponent {

    private IComponent component;

    public Decorator(IComponent component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("抽象装饰（Decorator）角色,operation called..");

    }
}
