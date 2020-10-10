package org.design.abstrac.factory;

import org.design.abstrac.factory.interfaces.IDepartment;
import org.design.abstrac.factory.interfaces.IFactory;
import org.design.abstrac.factory.interfaces.IUser;
import org.design.abstrac.factory.service.MySQLDepart;
import org.design.abstrac.factory.service.MySQLUser;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 9:40
 **/
public class MySQLFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new MySQLUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySQLDepart();
    }
}
