package org.design.abstrac.factory;

import org.design.abstrac.factory.interfaces.IDepartment;
import org.design.abstrac.factory.interfaces.IFactory;
import org.design.abstrac.factory.interfaces.IUser;

/**
 * @Author ybpeng
 * @create: 2020/10/9 0009 15:22
 * 抽象工厂客户端
 * 定义：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
 * 意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 主要解决：主要解决接口选择的问题。
 * 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 * 如何解决：在一个产品族里面，定义多个产品。
 * 关键代码：在一个工厂里聚合多个同类产品。
 * *优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * *缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 **/
public class ClientMain {

    public static void main(String[] args) {

        IFactory factory = new MySQLFactory();

//        IFactory factory = new OracleFactory();

        IUser user =  factory.createUser();
        IDepartment depart = factory.createDepartment();

        user.insertUser(null);
        user.getUser(1);

        depart.insertDepart(null);
        depart.getDepart(1);

    }

}
