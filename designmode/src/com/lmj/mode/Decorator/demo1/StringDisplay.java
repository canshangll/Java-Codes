package com.lmj.mode.Decorator.demo1;

public class StringDisplay extends Display{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() { // 字符数
        return string.getBytes().length;
    }

    @Override
    public int getRows() { //行数是1
        return 1;
    }

    @Override
    public String getRowText(int row) { //仅当row为0时返回值
        if (row==0){
            return string;
        }else {
            return null;
        }
    }
}
