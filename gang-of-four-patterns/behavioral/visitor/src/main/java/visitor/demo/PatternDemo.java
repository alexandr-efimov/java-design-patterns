package visitor.demo;

import lombok.extern.java.Log;
import visitor.Computer;
import visitor.ComputerPartVisitorReviewer;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartVisitorReviewer() {
        });
    }
}
