package com.lmj.mode.AdapterMode.demo3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("./TestFile/file.txt");
            f.setValue("year","2004");
            f.setValue("month","1");
            f.setValue("day","12");
            f.writeToFile("./TestFile/newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
