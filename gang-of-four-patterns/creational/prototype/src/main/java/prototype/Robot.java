package prototype;

import lombok.Value;

@Value
public class Robot implements Cloneable {

    String id;
    String name;
    RobotType type;

    @Override
    public Robot clone() {
        return new Robot(id, name, type);
    }
}
