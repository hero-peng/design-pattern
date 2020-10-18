package org.design.chain;

/**
 * @Author ybpeng
 * @create: 2020/10/18 0018 15:20
 * 责任链模式:
 * 为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住其下一个对象的引用而
 * 连成一条链；当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
 * 当一个对象在链条中传递时，有的拦截器处理，有的拦截器不处理。
 *
 * 职责链模式主要包含以下角色。
 * 1、抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 * 2、具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 * 3、客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 **/
public class ChainMain {


    public static void main(String[] args) {

        AbstractHandler handler1 = new ConcreteHandler1();

        AbstractHandler handler2 = new ConcreteHandler2();

        handler1.setNext(handler2);

        handler1.handleRequest("two");



    }

}
