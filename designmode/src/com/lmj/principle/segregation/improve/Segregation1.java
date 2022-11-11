package com.lmj.principle.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {

        A aa = new A();
        aa.depend1(new B());//A 类通过接口去依赖B类
        aa.depend2(new B());
        aa.depend3(new B());

        C cc = new C();
        cc.depend1(new D());
        cc.depend4(new D());
        cc.depend5(new D());

    }
}

//接口1
interface Interface1 {
    void opt1();
}

interface Interface2 {
    void opt2();
    void opt3();
}

interface Interface3 {
    void opt4();
    void opt5();
}

class B implements Interface1 ,Interface2{
    public void opt1() {
        System.out.println("B 实现了opt1");
    }

    public void opt2() {
        System.out.println("B 实现了opt2");
    }

    public void opt3() {
        System.out.println("B 实现了opt3");
    }

}

class D implements Interface1,Interface3 {
    public void opt1() {
        System.out.println("D 实现了opt1");
    }
    public void opt4() {
        System.out.println("D 实现了opt4");
    }

    public void opt5() {
        System.out.println("D 实现了opt5");
    }
}

class A { //A 类通过接口Interface1,Interface2 依赖(使用) B类，但是只会用到1,2,3方法
    public void depend1(Interface1 interface1) {
        interface1.opt1();
    }

    public void depend2(Interface2 interface1) {
        interface1.opt2();
    }

    public void depend3(Interface2 interface1) {
        interface1.opt3();
    }
}

class C { //C 类通过接口Interface1,Interface3 依赖(使用) D类，但是只会用到1,2,3方法
    public void depend1(Interface1 interface1) {
        interface1.opt1();
    }

    public void depend4(Interface3 interface1) {
        interface1.opt4();
    }

    public void depend5(Interface3 interface1) {
        interface1.opt5();
    }
}
