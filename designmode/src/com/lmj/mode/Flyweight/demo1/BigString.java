package com.lmj.mode.Flyweight.demo1;

public class BigString {
    //“大型字符”的数组
    private BigChar[] bigChars;

    //构造函数
    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }

    //共享方式初始化
    private void initShared(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    //非共享方式初始化
    private void initUnshared(String string) {
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }

    //显示
    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
