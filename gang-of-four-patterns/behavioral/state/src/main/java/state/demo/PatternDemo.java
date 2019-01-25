package state.demo;

import lombok.extern.java.Log;
import state.Context;
import state.StartState;
import state.StopState;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var context = new Context();

        var startState = new StartState();
        startState.doAction(context);
        log.info("State is: " + context.getState());

        var stopState = new StopState();
        stopState.doAction(context);
        log.info("State is: " + context.getState());
    }
}
