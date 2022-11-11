package com.lmj.mode.Facade.demo1;

public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src\\com\\lmj\\mode\\Facade\\src.txt","src\\com\\lmj\\mode\\Facade\\dec.txt");
    }
}
