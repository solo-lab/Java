package org.example;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private List<Product> products = new ArrayList<>();
    private double totalPrice;
    private String status;

    public Order(Cart cart) {
        this.products.addAll(cart.getProducts());
        this.totalPrice = cart.getTotalPrice();
        this.status = "Нове";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Замовлення:\n");
        products.forEach(product -> sb.append(product.toString()).append("\n"));
        sb.append("Загальна вартість: ").append(totalPrice).append("\n");
        sb.append("Статус: ").append(status);
        return sb.toString();
    }
}