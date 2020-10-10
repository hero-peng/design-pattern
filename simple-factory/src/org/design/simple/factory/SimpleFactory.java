package org.design.simple.factory;


import org.design.simple.factory.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 15:07
 **/
public class SimpleFactory {

    public static IOperator createOperator(String type){

        IOperator operator = null;
        switch (type){
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorSub();
                break;
            case "*":
                operator = new OperatorMul();
                break;
            case "/":
                operator = new OperatorDiv();
                break;
             default:
                break;
        }
        return operator;
    }
}
