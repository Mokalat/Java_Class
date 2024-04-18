package com.ohgiraffers.section02.looping;

public class A_for {
//    public void testSimpleForStatement(){
//        /*
//            [for문 표현식]
//                for(초기식; 조건식; 증감식){
//                      //조건식 참인 경우 실행할 구문 == 반복할 구문
//            }
//        */
//
//        for(int i = 0; i <= 10; i++){
//            // 최초 실행시 int i = 0;
//            // i <= 10
//            System.out.println("만원 단위 : " + i);
//            for (int x = 0; x <=10; x++){
//                System.out.println(("천원 단위 : " + x));
//            }
//        }
//    }

    public void  gugudan(){

        for(int i = 1; i <=1; i++){

            System.out.println(i +"단");

           for (int a = 1; a <=9; a++){
                int t = 2;
                int e = t*a;
                if ( a % t == 0 ){
                    System.out.println( t + ("*") + a + ("=") + e);
                }

           }



        }
    }
}
