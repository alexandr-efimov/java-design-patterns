package prototype.demo;

import lombok.extern.java.Log;
import prototype.Robot;
import prototype.RobotType;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        Robot robot = new Robot("firstOne", "Google", RobotType.ANDROID);
        Robot clone = robot.clone();

        log.info("Robot to be prototyped: " + robot);
        log.info("Origin and clone are equals: " + robot.equals(clone));
    }
}
