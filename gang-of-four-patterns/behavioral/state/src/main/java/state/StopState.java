package state;

import lombok.ToString;
import lombok.extern.java.Log;

@Log
@ToString
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        log.info("Player in STOP state");
        context.withState(this);
    }
}
