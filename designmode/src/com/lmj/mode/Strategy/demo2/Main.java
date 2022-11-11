package com.lmj.mode.Strategy.demo2;

import com.lmj.mode.Strategy.demo1.Strategy;

public class Main {
    public static void main(String[] args) {
        String[] data = {
          "Dumpty","Bowman","Carroll","Elfland","Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new TestSorter());
        sap.execute();
    }
}
