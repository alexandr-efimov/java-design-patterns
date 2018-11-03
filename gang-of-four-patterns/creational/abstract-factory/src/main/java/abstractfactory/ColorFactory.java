package abstractfactory;

import static java.util.Optional.ofNullable;

public class ColorFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        return ofNullable(color)
                .map(this::getColorByName)
                .orElseThrow(IllegalArgumentException::new);
    }

    private Color getColorByName(String color) {
        if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else {
            throw new IllegalArgumentException("No such color");
        }
    }

    @Override
    public Shape getShape(String shape) {
        throw new UnsupportedOperationException();
    }
}
