package com.lmj.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "邮件信息：hello";
    }
}
// 完成接收消息的功能
// 方式1分析
// 1、简单，比较容易想到
// 2、如果收到 其他信息 如 短信 微信 文件等，要新增类，同时Person也要增加相应的接收方法
// 3、解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口发送依赖
//      因为 Email 短信 微信  得到属于接收的范围，他们各自实现IReceiver 接口即可，这样就符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
