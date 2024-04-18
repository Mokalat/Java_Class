package com.ohgiraffers.section01.conditional;

// 프로그램내에서 모두가 사용할 수 있는 application02라는 클래스를 선안한다.

import java.util.Scanner;

public class Application02 {
    // 프로그램의 시작시 바로 사용할 수 있도록 static 영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진 args라는 변수를 선언한다.
    public static void main(String[] args) { //main의 시작

        // D_switch라는 자료형을 가진 dSwitch 변수를 만들고 D_swich 타입으로 값을 제공한다.
        // D_switch라는 사용자 저의 자료형으로써 타입은 우리가 만든 D_swich를 확인해야한다.
        D_switch dSwitch = new D_switch();

        // dSwitch 변수가 가지고 있는 testSimple메소드를 실행한다.
        dSwitch.switchStatement();
        dSwitch.testSimpleSwitchStatement();


        // 0. D_swich를 만든다.
        // D_switch dSwitch = new D_switch();

        // 1. 값을 반환 받는다.
        double result = dSwitch.switchCalculator();

        // 2. 화면에 출력한다.
        System.out.println(result);


        // 1. 학생의 성적을 입력받는다.
        Scanner sc =new Scanner(System.in);

        // 2. 입력받은 성적을 매개변수로 전달한다.
        int score = sc.nextInt();
        dSwitch.gradeCal(score);

    }//main의 종료
} //application02의 종료
