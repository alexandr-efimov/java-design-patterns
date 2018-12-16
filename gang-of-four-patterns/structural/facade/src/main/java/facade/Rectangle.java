package facade;

import lombok.extern.java.Log;

@Log
public class Rectangle implements Shape {

    @Override
    public void draw() {
        log.info("Draw RECTANGLE");
    }
}
