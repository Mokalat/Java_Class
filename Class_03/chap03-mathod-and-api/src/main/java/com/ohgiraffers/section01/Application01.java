package com.ohgiraffers.section01;

public class Application01 {
    public static void main(String[] args) {
    /*
        매소드
        메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
     */
        System.out.println("main() 시작됨....");
        Application01 app1 = new Application01();
        Application01 app2 = new Application01();

        app1.meathoadA();
        app2.meathoadB();

    }
    public void meathoadA() {
        System.out.println(("meathoadA()를 호출함"));
    }
    public void meathoadB() {
        System.out.println("meathoadB()를 호출해볼까? git짜증나");
    }
}
