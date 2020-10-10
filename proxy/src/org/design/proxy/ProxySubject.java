package org.design.proxy;

import org.design.proxy.interfaces.ISubject;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:58
 * 代理类，保存一个引用使得代理可以访问真实的主题对象
 **/
public class ProxySubject implements ISubject {

    private RealSubject realSubject;

    @Override
    public void request() {
        System.out.println("ProxySubject request");
        realSubject.request();
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
}
