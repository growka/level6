package ru.geekbrains.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public int calculateAllProducts() {
        List<Product> products =  productRepository.getProducts();
        return products.size();
    }

    public double calculateAvgPrice() {
        List<Product> products = productRepository.getProducts();

        if(products.size() == 0) {
            return 0;
        }

        int avg = 0;
        for (Product p : products) {
            avg += p.getCost();
        }
        avg /= products.size();
        return avg;
    }

    public void createProduct(int id, String title, double cost) {productRepository.addProduct(new Product(id, title, cost));}

    public Product getProduct(int id) {return productRepository.getProduct(id);}

    public void updateProduct(int id, String title, double cost) {productRepository.updateProduct(id,title,cost);}

    public void deleteProduct(int id) {productRepository.deleteProduct(id);}



}
