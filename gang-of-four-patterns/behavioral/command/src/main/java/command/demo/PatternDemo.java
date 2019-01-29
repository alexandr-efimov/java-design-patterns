package command.demo;

import command.Broker;
import command.BuyStock;
import command.SellStock;
import command.Stock;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var stock = new Stock();

        var buyStock = new BuyStock(stock);
        var sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
