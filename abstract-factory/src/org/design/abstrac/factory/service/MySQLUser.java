package org.design.abstrac.factory.service;

import org.design.abstrac.factory.entity.User;
import org.design.abstrac.factory.interfaces.IUser;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 9:41
 **/
public class MySQLUser implements IUser {

    @Override
    public void insertUser(User user) {
        System.out.println("MySQLUser insertUser ");
    }

    @Override
    public User getUser(int id) {
        System.out.println("MySQLUser getUser ");
        return new User();
    }
}
