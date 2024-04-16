package com.ohgiraffers.section05.typecasting;

public class Application04 {
    public static void main(String[] args) {
        int inum = 200; //int 127 까지 넣을 수 있다. 200을 넣어버리면 오버플로우가 된다.
        byte bnum = (byte) inum; // byte는 127까지 넣을 수 없다.
        System.out.println(bnum);
    }
}
