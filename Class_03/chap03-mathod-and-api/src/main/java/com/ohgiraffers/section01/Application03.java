package com.ohgiraffers.section01;

public class Application03 {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;


        int age = 20;
        String phone = "010-1234-4567";
        String name = "홍길동";
        char gender = 'M';



        Application03 app3 = new Application03();

        String myInfo= app3.myInfo( 20 , "010-2003-2126", "홍길동" , '남');
        System.out.println(myInfo);
        System.out.println("나의 이름 : "+ age + " 전화번호 : " + phone + " 이름 : " + name + " 성별 + " + gender);

        int result = app3.plus(x,y);
        System.out.println(result);

        int minus2= app3.minus(x,y);
        System.out.println(minus2);

        int divide = app3.divide(x,y);
        System.out.println(divide);

        int multiply = app3.multiply(x,y);
        System.out.println(multiply);

    }

    /* 두 수를 더하기 함수
       접근제어자 변혼타입 함수명(매개변수){}
    */
    public int plus(int x, int y){
        int result = x + y;
        return result;
    }

    public int minus(int x, int y){
        int minus2 = (x-y);
        return minus2;
    }

    public int divide(int x, int y){
        int divide = (x / y);
        return divide;
    }

    public int multiply(int x, int y){
        int multiply = (x * y);
        return multiply;
    }

    public String myInfo(int age, String phone, String name, char gender){
        String myInfo = (age + phone + name + gender);
        return myInfo;
    }

}
