package command;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.java.Log;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Log
public class Stock {

    String name = "Apple";
    int quantity = 10;

    public void buy() {
        log.info("Stock BUY - " + name + "quantity: " + quantity);
    }

    public void sell() {
        log.info("Stock SELL - " + name + "quantity: " + quantity);
    }
}
