package com.ohgiraffers.section03;

public class Application01 {
    public static void main(String[] args) {
        /*
            증강연산자
            피연산자의 앞 or 뒤에 사용이 가능하다.
            '-+' : 1의 증가를 의마한다.
            '--' : 1의 감소를 의마한다.
            ++X || X++
        */

        int num = 0;
        int x = 10 + (++num);
        System.out.println(x);
        System.out.println(num);
        num =0;
        x = 10 + num++;
        System.out.println(x);
        System.out.println(num);
        System.out.println(-+num);

        num = 0 ;
        int result = num++ * 10;
        // result = num * 10;
        // num += 1;
        System.out.println("Test" + result);

        result = ++num * 10;

        System.out.println("Test" + result);

    }
}
