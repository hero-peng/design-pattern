package org.design.abstrac.factory;

import org.design.abstrac.factory.interfaces.IDepartment;
import org.design.abstrac.factory.interfaces.IFactory;
import org.design.abstrac.factory.interfaces.IUser;
import org.design.abstrac.factory.service.OracleDepart;
import org.design.abstrac.factory.service.OracleUser;

/**
 * @Author ybpeng
 * @create: 2020/10/10 0010 10:10
 **/
public class OracleFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepart();
    }
}
