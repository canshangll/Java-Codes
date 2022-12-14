package com.lmj.mode.Builder.demo2;

public class Director {
    private Builder builder;

    public Director(Builder builder) {  //因为接收的参数是Builder类的子类
        this.builder = builder;         //所以可以将其保存在builder字段中
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好",
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见",
        });
        builder.close();
    }
}
