package flyweight;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.extern.java.Log;

@Log
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@ToString
public class Circle implements Shape {

    String color;
    int x;
    int y;
    int radius;

    @Override
    public void draw() {
        log.info("Circle draw: " + this);
    }
}
