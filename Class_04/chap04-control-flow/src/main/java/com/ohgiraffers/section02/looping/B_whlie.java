package com.ohgiraffers.section02.looping;

public class B_whlie {
    public void testSimleWhileStatement(){
        /*
            [while문 표현식]
                초기식;
                while(조건식){
                    조건식을 만족하는 경우 수앵할 구문 (반복할 구문);
                    증감식;
            }
            while(조건식){
                조건식을 만족하는 경우 수행할 구문
            }
        */

        int i = 0;
        while (i <= 8){ // 반복해야 하는 대상의 길이를 알 수 없는때 사용한다.
            i++;
             for (int j = 1; j <= 9; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }

    public void WhileGugudan(){

        // 1. 초기식
        int i = 2;
        int j = 2;
        // 2. while문의 조건식
        while (i<=9){

            // 3. 중첩 while 조건식
            while(j<=9){
                // 4. i * j 연산

                // 5. 출력
                System.out.println(i+"*"+j+"="+i*j);
                // 6. 중첩 while 증감식
                j++;
            }
            // 7. while 증감식
            i++;
        }
        // 종료
    }
}
