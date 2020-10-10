package org.design;

import org.design.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 13:43
 * 加法操作类
 **/
public class OperatorAdd implements IOperator {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }

}
