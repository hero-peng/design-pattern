package org.design.abstrac.factory.service;

import org.design.abstrac.factory.entity.User;
import org.design.abstrac.factory.interfaces.IUser;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 10:15
 **/
public class OracleUser implements IUser {

    @Override
    public void insertUser(User user) {
        System.out.println("OracleUser insertDepart");
    }

    @Override
    public User getUser(int id) {
        System.out.println("OracleUser getUser");
        return null;
    }
}
