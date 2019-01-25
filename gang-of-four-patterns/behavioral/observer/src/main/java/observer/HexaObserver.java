package observer;

import lombok.NonNull;
import lombok.extern.java.Log;

@Log
public class HexaObserver extends Observer {

    public HexaObserver(@NonNull Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Hex value is: " + Integer.toHexString(subject.getState()));
    }
}
