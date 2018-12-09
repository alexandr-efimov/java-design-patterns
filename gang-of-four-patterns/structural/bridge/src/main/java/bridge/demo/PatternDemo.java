package bridge.demo;

import bridge.Circle;
import bridge.GreenCircle;
import bridge.RedCircle;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        Circle redCircle = new Circle(10, 20, 5, new RedCircle());
        Circle greenCircle = new Circle(1, 2, 3, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
