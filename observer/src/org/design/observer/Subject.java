package org.design.observer;

import org.design.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ybpeng
 * @create: 2020/10/12 0012 16:34
 *
 * 主题对象
 **/
public class Subject {

    private List<Observer> list;

    public Subject(){
        list = new ArrayList<Observer>();
    }

    //添加观察者对象
    public void addObserver(Observer observer){
        list.add(observer);
    }

    //移除观察者对象
    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    public void notifyObserver(){
        for (Observer item:list){
            item.update();
        }
    }



}
