package product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int id;
    private String title;
    private double cost;

    @Override
    public String toString() {
        return "Product:" +
                id +
                ", " + title  +
                ", " + cost +
                "$";
    }
}
