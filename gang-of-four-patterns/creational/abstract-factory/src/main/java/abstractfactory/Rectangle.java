package abstractfactory;

import lombok.extern.java.Log;

@Log
public class Rectangle implements Shape {

    private static final String SHAPE_NAME = "rectangle";

    public void draw() {
        log.info(String.join("-", "Draw shape", Rectangle.SHAPE_NAME));
    }
}
