package com.lmj.mode.Builder.demo2;

public interface Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
