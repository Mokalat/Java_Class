package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        /*
            [if 표현식]
                if(조건식){
                    조건식이 참인 경우 실행할 명령문
                }

            조건식 : ture of false가 나오는 연산식을 의미한다.
        */

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요 : ");
        int num = sc.nextInt();

        System.out.println("연산기호를 입력해주세요 : ");
        char ch = sc.nexte().charAt(0);

        System.out.println("값을 입력해주세요 :");
        int num2 = sc.nextInt();*/

        /* Scanner sc= new Scanner(System.in);x`
         String input = sc.nextLine();
         String[] target = input.split(" ");
         int result = 0; */

        /*
            2의 배수면 n은 2의 배수입니다.
            0이면 n은 0입니다.
            2의 배수가 아니면 n은 2의 배수가 아닙니다.
        */

      /* if(num % 2 == 0){
            System.out.println( num + "은 2의 배수 입니다. with if");
        }else if (num % 2 == 1){
            System.out.println( num +"은 2의 배수가 아닙니다. with else");
        }else {
            System.out.println(num + "해당사항이 안됩니다");
        } */



    /*  if (ch =='+'){
            System.out.println(+num + num2 );
        }else if (ch == '-'){
            System.out.println( num - num2);
        }else if (ch == '*') {
            System.out.println(num * num2);
        }else if (ch == '/'){
            System.out.println(num / num2);
        }else {
            return ;
        }*/

    }
   /* public String Call(){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result = 0;

        /*if(target[1] == "+"){
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        return "" +result;
        *
        if (target[1].equals("+")){
            result = result + Integer.parseInt(target[0]);
        }
        String a ="1";
        String b ="1";
        return " " + result;
    }*/

    public double calculator(){
        Scanner sc= new Scanner(System.in);
        double firstNumber=sc.nextInt();
        System.out.println("First number: "+firstNumber);
        int secondNumber=sc.nextInt();
        char operator=sc.next().charAt(0);
        double result;
        if (operator=='+'){
            result = firstNumber+secondNumber;
        }else if (operator=='-'){
            result = firstNumber-secondNumber;
        }else if (operator=='*'){
            result = firstNumber*secondNumber;
        }else{
            result = firstNumber/secondNumber;
        }
        return 0.0;
    }
}
