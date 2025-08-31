package application;

import model.dao.DAOFactory;
import model.dao.VendedorDAO;
import model.entities.Departamento;
import model.entities.Vendedor;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Departamento obj = new Departamento(1, "Livros");

        Vendedor vendedor = new Vendedor(8, "Roberto", "roberto@gmail.com", new Date(), 3000.0, obj);

        VendedorDAO vendedorDAO = DAOFactory.createVendedorDAO();

        System.out.println(obj);

        System.out.println(vendedor);
    }
}
