package org.design.chain;

/**
 * @Author ybpeng
 * @create: 2020/10/18 0018 15:23
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 **/
public abstract class AbstractHandler {

    private AbstractHandler next;


    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);

}
