package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {
        // 자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 버림처리하고 sing bit를 반전시켜 최소값으로 순한시킴

        byte num1 = 127;
        System.out.println("byte num : "+num1);
        num1++;
        System.out.println("byte num : "+num1);

        int firstNum = 1000000;
        int secondNum = 700000;
        int mult = firstNum * secondNum;
        System.out.println("(1) firstNum * secondNum =  "+mult);
        // 1280523264

        long longMulti = firstNum * secondNum;

        System.out.println("(2) firstNum * secondNum =   "+ longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("(3) firstNum * secondNum =   "+result);
    }
}
