package com.juaracoding;

public class Utils {

    static void delay (long detik){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
