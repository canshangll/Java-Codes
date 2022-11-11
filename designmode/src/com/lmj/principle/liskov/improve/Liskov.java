package com.lmj.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.fun1(11, 3));
        System.out.println("1-8=" + a.fun1(1, 8));

        System.out.println("--------------");
        B b = new B();
        //因为B类不再继承A类 因此调用者，不会再fun1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3=" + b.fun1(11, 3)); //这里的本意是求出11+3
        System.out.println("1-8=" + b.fun1(1, 8));  // 这里 1+8
        System.out.println("11+3+9=" + b.fun2(11, 3));

        //使用组合仍然可以使用到A类相关方法

        System.out.println("11-3="+b.fun3(11,3));//这里的本意是求出11-3
    }
}

//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写到Base类
}
//A类
class A extends Base {
    // 返回两个数的差
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}
//B类继承A类
// 新增一个新功能：完成两个数的相加，然后和9求和
class B extends Base {
    private A a = new A();
    //这里重写了A类的方法，可能是无意识
    public int fun1(int a, int b) {
        return a + b;
    }
    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
    //我们仍然想使用A的方法
    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }
}

