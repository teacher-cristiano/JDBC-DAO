package model.dao;

import model.dao.impl.VendedorDAOJDBC;

public class DAOFactory {

    public static VendedorDAO createVendedorDAO(){
        return new VendedorDAOJDBC();
    }
}
