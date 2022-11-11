package com.lmj.mode.Visitor.demo1;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        //成功
        structure.display(new Success());
        System.out.println("------------------");
        //失败
        structure.display(new Fail());
        System.out.println("------------------");
        //待定
        structure.display(new Wait());
        System.out.println("------------------");
    }
}
