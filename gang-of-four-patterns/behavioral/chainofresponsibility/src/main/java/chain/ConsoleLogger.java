package chain;

import lombok.NonNull;
import lombok.extern.java.Log;

@Log
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(@NonNull LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        log.info("CONSOLE logger: [" + logLevel + "]: " + message);
    }
}
