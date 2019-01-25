package observer;

import lombok.NonNull;
import lombok.extern.java.Log;

@Log
public class OctalObserver extends Observer {

    public OctalObserver(@NonNull Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Octal value is: " + Integer.toOctalString(subject.getState()));
    }
}
