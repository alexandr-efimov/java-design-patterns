package command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.forEach(Order::execute);

        orders.clear();
    }
}
