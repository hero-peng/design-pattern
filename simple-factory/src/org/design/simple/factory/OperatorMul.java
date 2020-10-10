package org.design.simple.factory;


import org.design.simple.factory.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 13:47
 * 乘法操作类
 **/
public class OperatorMul implements IOperator {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA*numberB;
    }
}
