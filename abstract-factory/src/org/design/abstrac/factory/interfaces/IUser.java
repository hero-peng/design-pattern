package org.design.abstrac.factory.interfaces;

import org.design.abstrac.factory.entity.User;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 9:09
 **/
public interface IUser {

    public void insertUser(User user);

    public User getUser(int id);
}
