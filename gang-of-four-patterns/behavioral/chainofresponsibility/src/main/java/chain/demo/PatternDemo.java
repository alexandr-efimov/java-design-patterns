package chain.demo;

import chain.AbstractLogger;
import chain.ConsoleLogger;
import chain.ErrorLogger;
import chain.FileLogger;
import chain.LogLevel;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var logger = getChainOFLoggers();

        logger.logMessage(LogLevel.ERROR, "O my God, Heap is over!");
        log.info("------");
        logger.logMessage(LogLevel.INFO, "Non critical info");
        log.info("------");
        logger.logMessage(LogLevel.DEBUG, "All is fine, JFYI");
    }

    private static AbstractLogger getChainOFLoggers() {
        var consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        var fileLogger = new FileLogger(LogLevel.INFO);
        var errorLogger = new ErrorLogger(LogLevel.ERROR);

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }
}
