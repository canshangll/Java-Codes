package com.lmj.mode.Proxy.demo1;

public class Main {
    public static void main(String[] args) {
        PrinterProxy p = new PrinterProxy("小明");
        System.out.println("现在的名字时 "+p.getPrinterName()+".");
        p.setPrinterName("小李");
        System.out.println("现在的名字时 "+p.getPrinterName()+".");
        p.print("你好你好你好你好");
    }
}
