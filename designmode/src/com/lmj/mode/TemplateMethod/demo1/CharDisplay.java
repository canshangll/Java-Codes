package com.lmj.mode.TemplateMethod.demo1;

public class CharDisplay extends AbstractDisplay {  //CharDisplay是AbstractDisplay
    private char ch;    //需要显示的字符
    public CharDisplay(char ch) { //构造函数中接收的字符保存在字段中
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.println("<<");
    }
    @Override
    public void print() {
        System.out.print(ch);
    }
    @Override
    public void close() {
        System.out.println(">>");
    }
}
