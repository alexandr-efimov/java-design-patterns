package bridge;

import lombok.extern.java.Log;

@Log
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        log.info(String.format("Draw circle RED: %d, %d, %d", radius, x, y));
    }
}
