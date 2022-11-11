package com.lmj.mode.Singleton.demo1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2){
            System.out.println("相同的实例");
        }else {
            System.out.println("不同的实例");
        }
        System.out.println("End.");

    }
}
