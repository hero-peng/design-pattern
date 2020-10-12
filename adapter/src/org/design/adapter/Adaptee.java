package org.design.adapter;

/*
* 需要被适配的类
* */
public class Adaptee {

    public void operation(int i ){
        System.out.println(" 被适配的对象被调用  operation int i = " + i);
    }
}
