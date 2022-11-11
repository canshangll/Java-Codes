package com.lmj.mode.Visitor.demo1;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();
    //增加到List
    public void attach(Person p){
        persons.add(p);
    }
    //移除
    public void detach(Person p){
        persons.remove(p);
    }
    //显示测试的情况
    public void display(Action action){
        for (Person person:persons){
            person.accept(action);
        }
    }

}
