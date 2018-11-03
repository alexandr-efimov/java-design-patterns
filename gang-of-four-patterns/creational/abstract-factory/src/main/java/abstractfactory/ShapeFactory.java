package abstractfactory;

import static java.util.Optional.ofNullable;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException();
    }


    @Override
    public Shape getShape(String shape) {
        return ofNullable(shape)
                .map(this::getShapeByName)
                .orElseThrow(IllegalArgumentException::new);
    }

    private Shape getShapeByName(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("No such shape");
        }
    }
}
