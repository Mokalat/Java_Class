package com.ohgiraffers.section01.conditional;

// D_switch라는 클래스를 모두가 사용할 수 있도록 만든다.

import java.util.Scanner;

public class D_switch { // D_switch의 시작
    // 클래스 내부 속성
    
    //testSimpleSwitchStatement라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 만든다.
    public double testSimpleSwitchStatement(){

        /*
            [switch문 표현식]
            switch(비교대상값){
                case 비교값 : 비교값이 참인 경우 실행할 구문; break;
                case 비교값 : 비교값이 참인 경우 실행할 구문; break;
                default : case에 모두 해당하지 않는 경우 ; break;
            }
         */

        // 사용자한테 값을 입력받을 수 있는 객체를 생성함
        Scanner sc = new Scanner(System.in);

        // 화면에 첫 번째 정수를 입력 : 를 입력하라는 내용을 출력함
        System.out.println("첫 번재 정수 입력 : ");

        // 사용자의 입력한 값을 first라는 변수에 정수로 받아서 대입함
        int first = sc.nextInt();

        // 사용자의 화면에 두 번째 정수를 입혁하라고 출력함
        System.out.println("두 번재 정수 입력 :");

        // 사용자가 입력한 값을 second라는 변수에 정수로 받아서 대입함
        int second = sc.nextInt();

        // 사용자의 화면에 연산 기호를 입력하라고 출력함
        System.out.println("연산 기호 입력 :");

        // 사용자가 입력한 연산 기호를 문자로 받아서 op에 대입함
        char ch = sc.next().charAt(0);

        // 아래의 계산기를 완성합시다.
        // 연산은 + - * / 가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력한다

        /*  switch (변수){
                case 비교값 : 실행할 구문; break;
            }*/

        switch(ch){ //ch의 변수를 기준으로 아래의 값과 일치하는지 확인함

            // ch가 +와 같다면 first+second 결과를 화면에 출력함
            case '+' : System.out.println(first+second);
            break;
            case '-' : System.out.println(first-second);
            break;
            case '*' : System.out.println(first*second);
            break;
            case '/' : System.out.println(first/second);
            break;

            //ch가 위의 수식에 모두 만족하이 않으면 같지 않음을 출력함
            default: System.out.println("연산 불가라");
            break;
        }
        return 0.0;
    } // testSimpleSwitch 메서드의 종료


    // 계산기를 만들고 결과를 반환합니다. (switch를 이용함) application02에서 출력해주세요
    // + - * / 만 제공하고 일치하는 연산이 없는 경우 연산 불가라는 결과를 출력하고 반환 값을 0.0으로 합니다.





    public void switchStatement(){

        Scanner sc = new Scanner(System.in);

        System.out.print("수학 점수 입력 : ");
        int math = sc.nextInt();

        System.out.print("국어 점수 입력 : ");
        int korean = sc.nextInt();

        System.out.print("영어 점수 입력 : ");
        int english = sc.nextInt();

        int total = (math+korean+english);
        double average = (math+korean+english)/3;

        String grase;
//        switch (average){
//            case 100 : System.out.println( total +"입니다" + average + "평균 점수 입니다" + ch + "등급입니다." );
//            break;
//        }

        if (average == 100){
            grase = "A+";
            System.out.println("총합"+total +"입니다" + average + "평균 점수 입니다" + grase + "등급입니다." );
        }else if (average >= 90 && average <100){
            grase = "A";
            System.out.println("총합"+ total +"입니다" + average + "평균 점수 입니다" + grase + "등급입니다." );
        }else if (average >= 85 && average < 90) {
            grase = "B+";
            System.out.println("총합"+ total +"입니다" + average + "평균 점수 입니다" + grase + "등급입니다." );
        }else if (average >= 75 && average < 85 ){
            grase = "B";
            System.out.println("총합"+ total +"입니다" + average + "평균 점수 입니다" + grase + "등급입니다." );
        }else if (average >= 61 && average < 75){
            grase = "C";
            System.out.println("총합"+ total +"입니다" + average + "평균 점수 입니다" + grase + "등급입니다." );
        }else if (average < 60) {
            grase = "D";
            System.out.println("총합"+ total +"입니다" + average + "평균 점수 입니다" + grase + "등급입니다." );
        }else{
            grase = "F";
            System.out.println("총합"+ total +"입니다" + average + "평균 점수 입니다" + grase+ "등급입니다." );
        }


    }

    // 등급 계산기 프로그램
    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    /*
        100 = a +
        100 ~ 90 = a
        90 ~ 85 = b+
        85 ~ 75 = b
        75 ~ 60 = c
        60 미만 D
        F는 없다.
    */

    // 선생님 풀이

    public double switchCalculator(){
        // 1. 값을 입력을 받음
        Scanner sc = new Scanner(System.in);

        // 2. 첫 수 입력받기
        int first = sc.nextInt();

        // 3. 두 번재 수 입력
        int second = sc.nextInt();

        // 4. 연산기호 입력
        char op = sc.next().charAt(0);
        double result = 0;
        // 5. 연산기호를 비교
        switch (op){
            case '+' : result = first+second; break;
            case '-' : result = first-second; break;
            case '*' : result = first*second; break;
            case '/' : result = first/second; break;
            default: System.out.println("연산 불가"); break;
        }

        // 6. 반환
        return result;
    }

    // 1. 메서드를 받는다
    public void  gradeCal(int score){
        // 2. 점수를 범위를 구분한다
        String Grade;
        if (score == 100){
            // 100 = a+
            Grade = "A+";

        }else if (score >= 90 && score <100){
            Grade = "A";
        }else if (score >= 85 && score < 90){
            Grade = "B+";
        } else if (score >= 75 && score < 85){
            Grade = "B";
        }else if (score < 60) {
            Grade = "C";
        }else {
            Grade = "D";
        }
        System.out.println("입력하신 학생의 점수는" + Grade + " 입니다.");
    }
} // D_switch의 종료
