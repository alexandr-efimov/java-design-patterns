package facade;

import lombok.extern.java.Log;

@Log
public class Circle implements Shape {

    @Override
    public void draw() {
        log.info("Draw CIRCLE");
    }
}
