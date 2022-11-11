package com.lmj.principle.inversion.improve;

public class DependencyPass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 方式1： 通过接口传递实现依赖
//        changhongTV changhongTV = new changhongTV();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changhongTV);
        //方式2:  通过构造器依赖
//        changhongTV changhongTV = new changhongTV();
//        OpenAndClose openAndClose = new OpenAndClose(changhongTV);
//        openAndClose.open();
        //方式3：通过setter方法传递
        changhongTV changhongTV = new changhongTV();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changhongTV);
        openAndClose.open();

    }

}

// 方式1： 通过接口传递实现依赖
// 开关的接口
//interface IOpenAndClose {
//    public void open(ITV tv); //抽象方法,接收接口
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//class changhongTV implements ITV{
//    @Override
//    public void play() {
//        System.out.println("打开长虹电视机");
//    }
//}

// 实现接口
//class OpenAndClose implements IOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

// 方式2: 通过构造方法依赖传递
//interface IOpenAndClose {
//    public void open(); //抽象方法
//}
//
//interface ITV { //ITV接口
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}
//
//class changhongTV implements ITV{
//    @Override
//    public void play() {
//        System.out.println("打开长虹电视机");
//    }
//}

// 方式3 , 通过setter方法传递
interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);
}

interface ITV { // ITV接口
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}

class changhongTV implements ITV{
    @Override
    public void play() {
        System.out.println("打开长虹电视机");
    }
}