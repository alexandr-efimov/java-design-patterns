package observer.demo;

import lombok.extern.java.Log;
import observer.BinaryObserver;
import observer.HexaObserver;
import observer.OctalObserver;
import observer.Subject;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        log.info("Change of STATE to: 1");
        subject.withState(1);

        log.info("Change of STATE to: 10");
        subject.withState(10);
    }
}
