package decorator.demo;

import decorator.Circle;
import decorator.Rectangle;
import decorator.RedShape;
import decorator.Shape;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShape(new Circle());
        RedShape redRectangle = new RedShape(new Rectangle());

        circle.draw();
        log.info("\n-----------");
        redCircle.draw();
        log.info("\n-----------");
        redRectangle.draw();
    }
}
