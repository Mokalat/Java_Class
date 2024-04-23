package com.ohgiraffers.section01.user_type;

public class Application01 {
    public static void main(String[] args) {
        String id = "정한1";
        String pwd = "pass01";
        String nae = "황정한";
        int age = 22;
        char gender = '남';
        String[] hobby = new String[]{"축구","헬스","런닝"};
        
        String id2 ="재희1";
        String pwd2 = "pass02";
        String name2 = "송재희";
        int age2 = 20;
        char gender2 = '여';
        String[] hobby2 = new String[]{"걷기","릴스시청","인사동"};

        //----------------------------


      Member hwang = new Member();

      Member song = new Member();

      hwang.id = "정환";
      hwang.pwd = "pass01";
      hwang.name = "황정한";
      hwang.gender = '남';
      hwang.age = 22;
      hwang.hobby = new  String[]{"축구","헬스","런닝"};


      song.id ="재희";
      song.pwd = "pass02";
      song.name = "송재희";
      song.gender = '여';
      song.age =20;
      song.hobby =new String[]{"걷기","릴스시청","인사동"};

      System.out.println(hwang);
      System.out.println(song);
    }
}
