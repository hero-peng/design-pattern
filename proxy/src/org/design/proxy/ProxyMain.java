package org.design.proxy;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 16:56
 * 静态代理模式客户端
 **/
public class ProxyMain {

    public static void main(String[] args) {

        ProxySubject proxy = new ProxySubject();
        proxy.request();

    }

}
