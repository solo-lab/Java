package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class User {
    private String name;
    private List<Order> orderHistory = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}
