package memento.demo;

import lombok.extern.java.Log;
import memento.CareTaker;
import memento.Originator;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var originator = new Originator();
        var careTaker = new CareTaker();

        originator.setState("state 1");
        originator.setState("state 2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state 3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state 4");
        log.info("Current state: " + originator.getState());

        var mementos = careTaker.getMementos();
        log.info("Stored Snapshots are: " + mementos);
    }
}
