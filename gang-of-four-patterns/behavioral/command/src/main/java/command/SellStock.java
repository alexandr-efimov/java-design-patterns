package command;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SellStock implements Order {

    private Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
