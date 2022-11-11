package com.lmj.mode.Composite.demo1;

import java.io.FileNotFoundException;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileNotFoundException { //加入目录条目
        throw new FileNotFoundException();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);//为一览加入前缀并显示目录条目一览
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
