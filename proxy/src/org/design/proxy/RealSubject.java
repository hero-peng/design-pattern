package org.design.proxy;

import org.design.proxy.interfaces.ISubject;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:57
 **/
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("RealSubject request");
    }

}
