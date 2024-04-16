package com.ohgiraffers.section2.variable;

public class Application01 {
    public static void main(String[] args) {
    /* 변수의 사용 목적
        1. 값에 의미를 부여하기 위한 목적
        2. 한 번 저장해둔값을 재사용 하기 위한 목적
        3. 시간에 따라 변한는 값을 저장하고 사용할 수 있다.
    */
        System.out.println("== 값에 의미 부여 테스트 ==");
        System.out.println("보너스를 보함한 급여 : "+(100000 + 20000)+"원");

        // 백만원 이하는 절삭

        int variable; // 변수 선언문

    //  System.out.println(variable);

        variable = 10; // 변수 초기화

        System.out.println(variable);


        int salary = 10 ;
        int bonus = 2 ;

    //  변수 = 주소

        System.out.println("보너스를 포함한 급여 : " + (salary+bonus)+"원");

    //  한 번 저장해둔 값을 재사용하기 위한 목적

        System.out.println("== 변수에 저장한 값 재 사용 테스트 ==");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 110포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 120포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 130포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 140포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 150포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 160포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 170포인트 지급하였습니다.");

        int point = 100 ;
        System.out.println("1번 고객에게 포인트"+point+"지급하였습니다" );
        System.out.println("1번 고객에게 포인트"+(point+=10)+"지급하였습니다" );
        System.out.println("1번 고객에게 포인트"+(point+=10)+"지급하였습니다" );
        System.out.println("1번 고객에게 포인트"+(point+=10)+"지급하였습니다" );
        System.out.println("1번 고객에게 포인트"+(point+=10)+"지급하였습니다" );
        System.out.println("1번 고객에게 포인트"+(point+=10)+"지급하였습니다" );

        double silver = 0.3;
        double vip = 0.5;


    }
}
