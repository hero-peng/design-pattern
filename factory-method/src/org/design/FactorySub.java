package org.design;

import org.design.interfaces.IFactory;
import org.design.interfaces.IOperator;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 14:04
 **/
public class FactorySub implements IFactory {

    @Override
    public IOperator createOperator() {
        return new OperatorSub();
    }
}
