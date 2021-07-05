package ru.geekbrains.spring.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDbRepository implements ProductRepository{
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1,"Apple",100));
        products.add(new Product(2,"Carrot",200));
        products.add(new Product(3,"Pineapple",300));
        products.add(new Product(4,"Strawberry",150));
        products.add(new Product(5,"Cherry",250));
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public Product getProduct(int id) {
        return products.get(id);
    }

    @Override
    public void updateProduct(int id, String title, double cost) {

        products.remove(id);
        products.add(id, new Product(id, title, cost));
    }

    @Override
    public void deleteProduct(int id) {

        products.remove(id);

    }

    public List<Product> getProducts() {return products;}


}
