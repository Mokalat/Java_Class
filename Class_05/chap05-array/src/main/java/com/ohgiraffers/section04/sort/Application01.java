package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application01 {
    public static void main(String[] args) {
     /*
        int num1 = 10;
        int num2 = 20;

        int temp = num1;
        num1 = num2;
        num2 = temp;
     */

        int [] num = {20,10};

        int temp = num[0]; // 20
        num[0] = num[1];   // 10
        num[1] = temp;

        int[ ] arr = {2,1,3};
        for (int x : arr ){
            Arrays.sort(arr);
            System.out.print(x+" ");
        }
        System.out.println("정렬 후 ");
        Arrays.sort(arr);
        for (int x : arr ){
            System.out.print(x+" ");
        }
    }

}
