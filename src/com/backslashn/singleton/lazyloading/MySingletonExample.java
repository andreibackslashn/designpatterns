package com.backslashn.singleton.lazyloading;

public class MySingletonExample {
    public static void main(String[] args) {
        MySingleton instanceOfMySingleton = MySingleton.getInstance();
        MySingleton sameInstanceOfMySingleton = MySingleton.getInstance();
        //true
        System.out.println(instanceOfMySingleton == sameInstanceOfMySingleton);
    }
}
