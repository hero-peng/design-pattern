package org.design.observer;

/**
 * @Author ybpeng
 * @create: 2020/10/12 0012 16:26
 * 定义：指多个对象间存在一对多的依赖关系，当主题对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式。
观察者模式是一种对象行为型模式，其主要优点如下。
1、降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。
2、目标与观察者之间建立了一套触发机制。
 **/
public class ObserverMain {

    public static void main(String[] args) {

        Subject subject = new Subject();

        ConcreteObserver observer = new ConcreteObserver();

        subject.addObserver(observer);

        subject.notifyObserver();

        System.out.println("移除观察者对象。。。");

        subject.removeObserver(observer);
        subject.notifyObserver();

    }

}
