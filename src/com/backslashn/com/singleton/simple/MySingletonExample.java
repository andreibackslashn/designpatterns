package com.backslashn.com.singleton.simple;

public class MySingletonExample {
    public static void main(String[] args) {
        MySingleton instanceOfMySingleton = MySingleton.getInstance();
        MySingleton sameInstanceOfMySingleton = MySingleton.getInstance();
        //true
        System.out.println(instanceOfMySingleton == sameInstanceOfMySingleton);

        //compilation eror MySingleton() has private access in com.backslashn.com.singleton.MySingleton
//        MySingleton instance3 = new MySingleton()
//        System.out.println(instanceOfMySingleton == instance3);
    }
}
