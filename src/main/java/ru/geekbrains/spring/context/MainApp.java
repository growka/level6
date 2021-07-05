package ru.geekbrains.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        if (cmd.equals("/avg_price")) {
            System.out.println(productService.calculateAvgPrice());
        }
        if (cmd.equals("/calc_products")) {
            System.out.println(productService.calculateAllProducts());
        }

        context.close();
    }
}
