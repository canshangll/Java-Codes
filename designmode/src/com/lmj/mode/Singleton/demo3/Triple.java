package com.lmj.mode.Singleton.demo3;

public class Triple {
    private int id;
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };

    private Triple(int id) {
        System.out.println("生成了实例id:" + id);
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
