package state;

import lombok.ToString;
import lombok.extern.java.Log;

@Log
@ToString
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        log.info("Player in START state");
        context.withState(this);
    }
}
