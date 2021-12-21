package com.homework.daniel.Threads;

import com.homework.daniel.Logging.Logger;
import com.homework.daniel.Logging.enums.LogLevel;

public class CustomThread extends Thread {
    @Override
    public void run() {
        super.run();
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.INFO, "Logging from: " + Thread.currentThread().getName());
    }
}

