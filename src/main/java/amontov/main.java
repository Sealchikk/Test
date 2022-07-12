package amontov;

import amontov.dao.ProductsDAO;
import amontov.products.Product;

public class main {
    public static void main(String[] args) {
        ProductsDAO productsDAO = new ProductsDAO();
        productsDAO.add(new Product());
    }
}
