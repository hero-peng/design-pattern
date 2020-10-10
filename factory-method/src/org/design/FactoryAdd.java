package org.design;

import org.design.interfaces.IFactory;
import org.design.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 14:02
 * 加法工厂
 **/
public class FactoryAdd implements IFactory{

    @Override
    public IOperator createOperator() {
        return new OperatorAdd();
    }
}
