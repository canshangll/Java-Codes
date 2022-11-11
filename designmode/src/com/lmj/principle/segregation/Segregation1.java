package com.lmj.principle.segregation;

public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1{
    void opt1();
    void opt2();
    void opt3();
    void opt4();
    void opt5();
}

class B implements Interface1{
    public void opt1(){
        System.out.println("B 实现了opt1");
    }
    public void opt2(){
        System.out.println("B 实现了opt2");
    }
    public void opt3(){
        System.out.println("B 实现了opt3");
    }
    public void opt4(){
        System.out.println("B 实现了opt4");
    }
    public void opt5(){
        System.out.println("B 实现了opt5");
    }
}

class D implements Interface1{
    public void opt1(){
        System.out.println("D 实现了opt1");
    }
    public void opt2(){
        System.out.println("D 实现了opt2");
    }
    public void opt3(){
        System.out.println("D 实现了opt3");
    }
    public void opt4(){
        System.out.println("D 实现了opt4");
    }
    public void opt5(){
        System.out.println("D 实现了opt5");
    }
}

class A { //A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
    public void depend1(Interface1 interface1){
        interface1.opt1();
    }
    public void depend2(Interface1 interface1){
        interface1.opt2();
    }
    public void depend3(Interface1 interface1){
        interface1.opt3();
    }
}

class C { //C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,2,3方法
    public void depend1(Interface1 interface1){
        interface1.opt1();
    }
    public void depend4(Interface1 interface1){
        interface1.opt4();
    }
    public void depend5(Interface1 interface1){
        interface1.opt5();
    }
}
