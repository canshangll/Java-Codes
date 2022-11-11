package com.lmj.mode.Decorator.demo1;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello,world");
        Display b2 = new UpDownBorder(b1,'#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new UpDownBorder(
                                        new SideBorder(
                                                new UpDownBorder(
                                                        new StringDisplay("你好，世界"),
                                                        '*'
                                                ),
                                                '='
                                        ),
                                        '|'
                                )
                        ),
                        '/'
                );
        b4.show();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("早上好。");
        md.add("下午好。");
        md.add("晚上好。");
        md.show();

        Display d5 = new SideBorder(md,'#');
        d5.show();
        Display d6 = new FullBorder(md);
        d6.show();


    }
}
