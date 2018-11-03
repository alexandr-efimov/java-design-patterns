package abstractfactory;

public interface AbstractFactory {

    Color getColor(String color);

    Shape getShape(String shape);
}
