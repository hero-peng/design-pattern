package org.design.abstrac.factory.service;

import org.design.abstrac.factory.entity.Department;
import org.design.abstrac.factory.interfaces.IDepartment;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 9:45
 **/
public class OracleDepart implements IDepartment {

    @Override
    public void insertDepart(Department depart) {
        System.out.println("OracleDepart insertDepart");
    }

    @Override
    public Department getDepart(int id) {
        System.out.println("OracleDepart getDepart");
        return new Department();
    }
}
