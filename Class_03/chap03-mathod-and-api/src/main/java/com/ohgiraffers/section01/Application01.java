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
        app1.methodA();
        System.out.println("main() 종료됨....");

    }
    public void methodA() {
        System.out.println(("methodA()를 호출함"));
        methodB();
        System.out.println("methodA()를 종료됨함");
        return;
    }
    public void methodB() {
        System.out.println("methodB()를 시작됨 ");
        methodC();
        System.out.println("methodB()를 종료됨 ");
    }
    public void methodC(){
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");
        
    }
    
}
