package org.design;

import org.design.interfaces.IFactory;
import org.design.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 14:05
 **/
public class FactoryDiv implements IFactory{

    @Override
    public IOperator createOperator() {
        return new OperatorDiv();
    }
}
