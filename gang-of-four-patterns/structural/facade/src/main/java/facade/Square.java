package facade;

import lombok.extern.java.Log;

@Log
public class Square implements Shape {

    @Override
    public void draw() {
        log.info("Draw SQUARE");
    }
}
