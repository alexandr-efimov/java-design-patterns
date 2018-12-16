package composite.demo;

import composite.Employee;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        Employee angel = new Employee("Angel", "d003", "team lead");
        Employee joe = new Employee("Joe", "d003", "engineer");
        Employee peter = new Employee("Peter", "d002", "engineer");

        Employee alex = new Employee("Alex", "d003", "manager");

        angel.add(peter);
        alex.add(angel);
        alex.add(joe);

        log.info("Alex is: " + alex);
        alex.getSubordinates().forEach(subordinate -> log.info("Subordinates of Alex: " + subordinate));
    }
}
