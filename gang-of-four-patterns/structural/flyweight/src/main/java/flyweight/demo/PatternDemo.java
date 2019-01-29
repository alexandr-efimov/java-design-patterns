package flyweight.demo;

import flyweight.Shape;
import flyweight.ShapeFactory;
import lombok.extern.java.Log;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var colors = List.of("Green", "Blue", "White");

        for (int i = 0; i < 10; i++) {
            Shape circle = ShapeFactory.getCircle(getRandom(colors));
            circle.draw();
        }

    }

    private static String getRandom(List<String> colors) {
        return colors.get(ThreadLocalRandom.current().nextInt(0, colors.size()));
    }
}
