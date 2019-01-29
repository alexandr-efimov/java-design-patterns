package chain;

import lombok.NonNull;
import lombok.extern.java.Log;

@Log
public class FileLogger extends AbstractLogger {

    public FileLogger(@NonNull LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        log.info("FILE logger: [" + logLevel + "]: " + message);
    }
}
