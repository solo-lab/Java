package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private Category category;

    public static List<Product> searchProducts(String query, List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(query.toLowerCase()) ||
                    product.getCategory().getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}
