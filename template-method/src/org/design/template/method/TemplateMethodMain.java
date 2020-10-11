package org.design.template.method;


/*
* 模板方法模式客户端调用类
* 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
* 它是一种类行为型模式。
* 该模式的主要优点如下。
* 1、它封装了不变部分，扩展可变部分。它把认为是不变部分的算法封装到父类中实现，而把可变部分算法由子类继承实现，便于子类继续扩展。
* 2、它在父类中提取了公共的部分代码，便于代码复用。
* 3、部分方法是由子类实现的，因此子类可以通过扩展方式增加相应的功能，符合开闭原则。
* */
public class TemplateMethodMain {

    public static void main(String[] args) {

        AbstractClass clazz = new ConcreteClass();

        clazz.templateMethod();

    }
}
