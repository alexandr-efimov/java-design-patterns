package bridge;

import lombok.extern.java.Log;

@Log
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        log.info(String.format("Draw circle GREEN: %d, %d, %d", radius, x, y));
    }
}
