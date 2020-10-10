package org.design.abstrac.factory.interfaces;

import org.design.abstrac.factory.entity.Department;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 9:12
 **/
public interface IDepartment {

    public void insertDepart(Department depart);

    public Department getDepart(int id);
}
