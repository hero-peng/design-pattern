package org.design.facade;

public class FacadePattern {

    private SubSystem1 subSystem1;

    private SubSystem2 subSystem2;

    private SubSystem3 subSystem3;

    public FacadePattern(){
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }

    public void method(){
        System.out.println("FacadePattern 外观模式 method() 方法被调用");
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }
}
