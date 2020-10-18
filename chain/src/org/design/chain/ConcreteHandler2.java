package org.design.chain;

/**
 * @Author ybpeng
 * @create: 2020/10/18 0018 15:27
 * 具体处理者角色2
 **/
public class ConcreteHandler2 extends AbstractHandler{

    @Override
    public void handleRequest(String request) {

        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }

    }
}
