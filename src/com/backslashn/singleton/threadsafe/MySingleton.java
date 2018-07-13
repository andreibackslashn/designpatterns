package com.backslashn.singleton.threadsafe;

public class MySingleton {
    //added volatile
    private static volatile MySingleton instance = null;

    private MySingleton(){};

    public static MySingleton getInstance(){
        //double checked locking
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

}
