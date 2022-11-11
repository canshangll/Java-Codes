package com.lmj.mode.AdapterMode.demo2;

public class Main {
    public static void main(String[] args) {
        //为什么使用Print类型而不使用PrintBanner类型的变量
        //1、两者对外提供的方法是相同的。
        //2、可以明确的表示程序的意图：并不是使用PrintBanner类中的方法，而是使用Print接口中的方法。
        //3、即使将变量保存在Print类型变量中，如果对象的实际类型是PrintBanner类型，那么依然可以通过类型转换来调用PrintBanner类中独有的方法
        //      ((PrintBanner)p).methodWhichExistsOnlyInprintBanner();
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
