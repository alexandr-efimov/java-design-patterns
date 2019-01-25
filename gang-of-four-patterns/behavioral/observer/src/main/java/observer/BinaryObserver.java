package observer;

import lombok.NonNull;
import lombok.extern.java.Log;

@Log
public class BinaryObserver extends Observer {

    public BinaryObserver(@NonNull Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Binary value is: " + Integer.toBinaryString(subject.getState()));
    }
}
