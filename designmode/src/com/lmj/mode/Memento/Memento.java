package com.lmj.mode.Memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;//所持金钱
    ArrayList fruits;//获得的水果

    public int getMoney() {//获取当前所持金钱(narrow interface)
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {//添加水果
        fruits.add(fruit);
    }

    List getFruits() {//获取当前所持所有水果
        return (List) fruits.clone();
    }
}
