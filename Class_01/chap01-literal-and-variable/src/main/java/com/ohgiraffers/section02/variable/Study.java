package com.ohgiraffers.section02.variable;

public class Study {
    public static void main(String[] args) {
        int Ko = 99;
        int En = 80;
        int Mt = 96;

        double avg = (Ko + En + Mt) / 3.0;

        System.out.println((Ko+En+Mt)/3);
        System.out.println((Ko+En+Mt)/3.0);
        System.out.println((int)avg);

        int Test = 10;
        int Test2 = 20;

        String str = "test";
        String str1 = "test2";

        System.out.println(str + " " + str1);

        String name = "이은석";
        int age = 31;
        String gender = "남자";

        System.out.println("이름 : " + name  + " 나이 : " + age + " 성별 :  " + gender);

        System.out.print(name);
        System.out.print(age);
        System.out.println(gender);

    }
}
