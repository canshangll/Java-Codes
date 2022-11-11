package com.lmj.mode.Singleton.demo2;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
        System.out.println("生成了一个实例");
    }
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
    public static TicketMaker getInstance(){
        return ticketMaker;
    }
}
