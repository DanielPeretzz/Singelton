package com.homework.daniel;

import com.homework.daniel.Threads.CustomThread;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new CustomThread();
        Thread t2 = new CustomThread();
        t1.start();
        t2.start();
    }
}
