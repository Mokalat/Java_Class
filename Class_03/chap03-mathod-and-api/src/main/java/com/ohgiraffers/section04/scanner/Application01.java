package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        // Scanner라는 사용자에게 입력값을 받아서 사용한다

        Scanner sc = new Scanner(System.in);
        // sc 변수명 == 메모리주소 == 값
        System.out.print("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
       //System.out.println("입력하신 당신의 이름은 " + name + "입니다.");

        System.out.print("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("당신의 키를 입력해주세요 :");
        double salary = sc.nextDouble();
        System.out.print("당신의 성별을 입력해주세요 :");
        char gender = sc.next().charAt(0);

        Application01 app = new Application01();
        String myInfo = app.myInfo(name, age, salary, gender);
        System.out.println(myInfo);

        Application01 app1 = new Application01();
        String info =app1.inputInfo();
        System.out.println(info);
    }

    /*
        inputInfo 메서드를 만들고
        사용자의 이름, 키, 성별, 나이를 입력받아 main에 출력해주세요

       1. inputInfo 함수를 만든다.
            접근제어자 반환 타입(String) 메서드명(){}

       2. 사용자에게 값을 입력받는다.
            Scanner sc = new Sanner();

       3. 키 나이 성별 이름을 입력받아 문자열로 합친다.
            더블 키;
            정수 나이;
            문자 성별;
            문자열 이름;

       4. 문자열로 반환한다.
            return;

    */


    public String myInfo(String name , int age , double salary  , char gender) {

        String myName = name;
        int myAge = age;
        double mySalary = salary;
        char myGender = gender;

        String myInfo = name + age + salary + gender;

        return myInfo;

    }

    public String inputInfo(){

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("당신의 키를 입력해주세요 :");
        double salary = sc.nextDouble();
        System.out.print("당신의 성별을 입력해주세요 :");
        char gender = sc.next().charAt(0);
        return "당신의 이름은 " + name + "입니다 \n" + "당신의 나이는 " + age +"세 입니다\n" + "당신의 키는 " + salary + "cm 입니다.\n"+ "당신의 성별은 " + gender+"입니다.";
    }
}
