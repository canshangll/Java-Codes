package com.lmj.mode.Command.demo1;

import com.lmj.mode.Command.demo1.command.Command;
import com.lmj.mode.Command.demo1.command.MacroCommand;
import com.lmj.mode.Command.demo1.drawer.DrawCanvas;
import com.lmj.mode.Command.demo1.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

    //绘制的历史记录
    private MacroCommand history = new MacroCommand();
    //绘制区域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    //删除按钮
    private JButton clearButton = new JButton("clear");

    public Main(String title) {
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
