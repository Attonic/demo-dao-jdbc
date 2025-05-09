package model.dao;

import db.Db;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao creatSellerDao() {
        return new SellerDaoJDBC(Db.getConnecton());
    }
}
