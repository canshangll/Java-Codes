package com.lmj.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

//方式3的分析
//1、这种修改方法没有对原来的类大的修改，只是增加了方法
//2、没有在类这个级别上遵守单一职责原则，在方法级别上遵守单一职责
class Vehicle2 {
    public void run(String vehicle){
        System.out.println(vehicle+" 公路运行");
    }
    public void runAir(String vehicel) {
        System.out.println(vehicel + " 在天空运行...");
    }
    public void runWater(String vehicel) {
        System.out.println(vehicel + " 在水路运行...");
    }
}
