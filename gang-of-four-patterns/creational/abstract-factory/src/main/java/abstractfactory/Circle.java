package abstractfactory;

import lombok.extern.java.Log;

@Log
public class Circle implements Shape {

    private static final String SHAPE_NAME = "circle";

    public void draw() {
        log.info(String.join("-", "Draw shape", Circle.SHAPE_NAME));
    }
}
