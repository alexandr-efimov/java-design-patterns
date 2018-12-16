package facade.demo;

import facade.ShapeMaker;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
