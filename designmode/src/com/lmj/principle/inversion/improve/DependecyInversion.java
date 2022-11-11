package com.lmj.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiChat());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "邮件信息：hello";
    }
}

class WeiChat implements IReceiver{
    public String getInfo(){
        return "微信信息：hello";
    }
}

// 方式2
class Person{
    //这里是 对接口的依赖
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
