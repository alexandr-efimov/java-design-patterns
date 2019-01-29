package flyweight;

import lombok.NonNull;
import lombok.extern.java.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Log
public class ShapeFactory {

    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle(@NonNull String color) {

        Shape shape = shapes.get(color);

        if (Objects.isNull(shape)) {
            shape = new Circle(color, 10, 10, 20);
            shapes.put(color, shape);

            log.info("New shape put to cache: " + shape);
        }

        return shape;
    }
}
