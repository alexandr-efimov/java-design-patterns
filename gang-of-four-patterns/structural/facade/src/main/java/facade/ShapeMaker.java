package facade;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ShapeMaker {

    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }
}
