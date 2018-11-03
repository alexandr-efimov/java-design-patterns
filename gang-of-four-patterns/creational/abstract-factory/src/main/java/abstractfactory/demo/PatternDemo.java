package abstractfactory.demo;

import abstractfactory.AbstractFactory;
import abstractfactory.Color;
import abstractfactory.FactoryProducer;
import abstractfactory.Shape;
import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        log.info("Colors");
        List<Color> colors = Arrays.asList(colorFactory.getColor("red"), colorFactory.getColor("GREEN"));
        colors.forEach(Color::fill);

        log.info("Shapes");
        List<Shape> shapes = Arrays.asList(shapeFactory.getShape("rectangle"), shapeFactory.getShape("circle"));
        shapes.forEach(Shape::draw);
    }
}
