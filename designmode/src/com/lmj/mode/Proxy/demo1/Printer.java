package com.lmj.mode.Proxy.demo1;

public class Printer implements Printable {
    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob(" 正在生成Printer实例(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {//设置名字
        this.name = name;
    }

    @Override
    public String getPrinterName() { //获取名字
        return name;
    }

    @Override
    public void print(String string) { //显示带打印机名字的文字
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {//重活
        System.out.println(msg);
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf(".");
        }
        System.out.println("结束。");
    }
}
