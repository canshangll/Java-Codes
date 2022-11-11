package com.lmj.mode.Singleton.demo3;

import com.lmj.mode.Singleton.demo2.TicketMaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 1; i <= 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
