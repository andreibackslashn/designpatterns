package com.backslashn.singleton.lazyloading;

public class MySingleton {
    //a new instance of MySingleton is not created at class loading
    private static MySingleton instance = null;

    private MySingleton(){};

    public static MySingleton getInstance(){
        //a new instance will be created only when requested for the first time
        if (instance == null) {
            instance = new MySingleton();
        }
    return instance;
//        return (instance==null) ? instance = new MySingleton(): instance;
    }
}
