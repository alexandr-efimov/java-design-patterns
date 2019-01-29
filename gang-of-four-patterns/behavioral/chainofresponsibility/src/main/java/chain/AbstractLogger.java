package chain;

import lombok.NonNull;
import lombok.Setter;

public abstract class AbstractLogger {

    @Setter
    protected AbstractLogger nextLogger;

    LogLevel logLevel;

    public void logMessage(LogLevel logLevel, @NonNull String message) {

        if (logLevel.ordinal() >= this.logLevel.ordinal()) {
            write(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }
    }

    protected abstract void write(String message);
}
