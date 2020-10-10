package org.design.abstrac.factory.service;

import org.design.abstrac.factory.entity.Department;
import org.design.abstrac.factory.interfaces.IDepartment;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 10:16
 **/
public class MySQLDepart implements IDepartment {

    @Override
    public void insertDepart(Department depart) {
        System.out.println("MySQLDepart insertUser ");
    }

    @Override
    public Department getDepart(int id) {
        System.out.println("MySQLDepart getDepart ");
        return null;
    }
}
