package org.design.adapter;

/*
* 适配器对象
* */
public class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter(){
        adaptee = new Adaptee();
    }

    @Override
    public void operation() {
        adaptee.operation(5);
        System.out.println("Adapter 适配器对象呗调用");
    }
}
