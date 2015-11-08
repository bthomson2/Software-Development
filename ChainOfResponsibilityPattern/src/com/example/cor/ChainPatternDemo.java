package com.example.cor;

/**
 * Created by Brenda on 11/8/2015.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is error information.");
    }
}
