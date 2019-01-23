package templatemethod;

import lombok.extern.java.Log;

@Log
public class Football extends Game {
    @Override
    void initialize() {
        log.info("Football game INITIALIZED");
    }

    @Override
    void startPlay() {
        log.info("Football game STARTED");
    }

    @Override
    void endPlay() {
        log.info("Football game ENDED");
    }
}
