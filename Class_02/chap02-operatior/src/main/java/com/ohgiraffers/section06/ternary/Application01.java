package com.ohgiraffers.section06.ternary;

public class Application01 {
    public static void main(String[] args) {
        /*
            삼항 연산자
            자바에서 유일하게 피연산자 항목이 3개인 연산자다.
            항목이 3개임 : (조건식)? 참일 경우 : 거짓일 경우
            조건식은 반드시 결과가 true || false 가 나오도록 해야한다.

         */

        int num = 10;
        int num2 = -10;
        // num1 열과 num2를 삼항 연산자를 이용하여 양수 또는 음수로 표현해주세요
        // 삼항 연산자 중첩 사용

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;
        // String result3 = (num3 > 0) ? "양수이다." : (num3 == 0 )? "0이다." : "음수이다.";
        // 중첩 삼항 연산자 사용
        // num4가 양수인지 음수인지 0인지 확인해주세요
        // num5가 양수인지 음수인지 0인지 확인해주세요

        String result3 = (num4>0)?"양수이다." : (num4==0)? "0이다." :  "음수이다.";

        System.out.println(result3);

        String result4 = (num5>0)?"양수이다." : (num5==0)? "0이다." :  "음수이다.";

        System.out.println(result4);
    }
}
