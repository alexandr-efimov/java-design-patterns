package abstractfactory;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else {
            throw new IllegalArgumentException("No such factory");
        }
    }

}
