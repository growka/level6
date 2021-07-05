package ru.geekbrains.spring.context;


import java.util.List;

public interface ProductRepository {

    void addProduct(Product product);
    Product getProduct(int id);
    void updateProduct(int id, String title, double cost);
    void deleteProduct(int id);
    List<Product> getProducts();

}
