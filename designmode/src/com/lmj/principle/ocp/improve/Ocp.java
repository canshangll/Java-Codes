package com.lmj.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

//用于绘图的类
class GraphicEditor {
    //接收Shape对象，根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}
//Shape类，基类
abstract class Shape {
    int m_type;
    public abstract void draw();//抽象方法
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形 ");
    }
}
class Other extends Shape {
    public Other() {
        super.m_type = 4;
    }
    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
