package chain;

import lombok.NonNull;
import lombok.extern.java.Log;

@Log
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(@NonNull LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        log.info("ERROR logger: [" + logLevel + "]: " + message);
    }
}
