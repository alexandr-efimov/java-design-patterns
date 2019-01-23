package templatemethod;

import lombok.extern.java.Log;

@Log
public class Cricket extends Game {
    @Override
    void initialize() {
        log.info("Cricket game INITIALIZED");
    }

    @Override
    void startPlay() {
        log.info("Cricket game STARTED");
    }

    @Override
    void endPlay() {
        log.info("Cricket game ENDED");
    }
}
