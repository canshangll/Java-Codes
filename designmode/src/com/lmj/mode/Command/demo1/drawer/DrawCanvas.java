package com.lmj.mode.Command.demo1.drawer;

import com.lmj.mode.Command.demo1.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    //颜色
    private Color color = Color.red;
    //要绘制的圆点的半径
    private int radius = 6;
    //命令的历史记录
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    //重新全部绘制
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    //绘制
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
