package com.ohgiraffers.section03.math;

public class Application01 {
    public static void main(String[] args) {
        /*
            api란
             Application programing interface는 응용프로그램에서 사용할 수 있도록
             운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
             쉽게 말해서 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 jdk를 설치하면 사용할 수 있도록 소스코드 ( 크래스나 인터페이스)들을 의미한다.
             더 쉽게 누군가 작성해놓은 소스코드를 가져다 사용하는 것이다.
         */

        // 자바에는 수만읂 Api를 제공해준다 그러므로 잘 활용 할 줄 알아야한다.
        System.out.println(java.lang.Math.abs(-7));

    }
}
