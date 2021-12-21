package com.homework.daniel.Logging;

import com.homework.daniel.Logging.enums.LogLevel;

public class Logger {
    private Logger() {}

    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(LogLevel logLevel, String msg) {
        System.out.println("<" + logLevel.name() + "> : " + msg);
    }
}
