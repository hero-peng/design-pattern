package org.design.simple.factory;


import org.design.simple.factory.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 13:57
 **/
public class OperatorDiv implements IOperator {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA/numberB;
    }
}
