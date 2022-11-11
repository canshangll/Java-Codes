package com.lmj.mode.Decorator.demo1;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {//字符数为被装饰物的字符数加上两侧边框字符数
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {//行数为被装饰物的行数加上上下边框的行数
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {//指定的那一行的字符串
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
