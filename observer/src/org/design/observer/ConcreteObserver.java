package org.design.observer;

import org.design.observer.interfaces.Observer;

/**
 * @Author ybpeng
 * @create: 2020/10/12 0012 16:39
 **/
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("观察者对象update");
    }
}
