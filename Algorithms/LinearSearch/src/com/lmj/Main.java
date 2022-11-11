package com.lmj;

public class Main {
    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

//        LinearSearch ls = new LinearSearch();

        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);

        Student student1 = new Student("张三");
        Student[] stus = {new Student("Alice"),
                            new Student("Bobo"),
                            new Student("Charles")};
        Student bobo = new Student("bobo");
        int res3 = LinearSearch.search(stus, bobo);
        System.out.println(res3);

    }
}
