package com.ohgiraffers.library;

import com.ohgiraffers.library.book.Book;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        Book book = new Book();

        String bookName;
        int bookNumber ;
        String publisher;


        BookNameSave:
        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("1. 책 등록");
            System.out.println("2. 회원 등록");
            System.out.println("3. 등록된 책 보기");
            System.out.print(">>");
            int option = sc.nextInt();
            switch (option){
                case 1 :{

                    Scanner bookNameSave = new Scanner(System.in);
                    Scanner bookNumberSave = new Scanner(System.in);
                    Scanner bookPublisherSave = new Scanner(System.in);

                    System.out.println("책을 이름을 등록하세요 : " );
                    bookName = bookNameSave.nextLine();

                    System.out.println("책을 번호를 등록하세요 : " );
                    bookNumber = bookNumberSave.nextInt();

                    System.out.println("책 출판사를 등록하세요 : ");
                    publisher = bookPublisherSave.nextLine();

                    String bookInfo ="책이름 : "+ bookName + " 책 번호 : "+bookNumber + " 출판사 이름 : " + publisher;
                    System.out.println(bookInfo);
                }
                break;
                case 2 : {

                    String userName;
                    int userPhone;

                    Scanner userNameSave = new Scanner(System.in);
                    Scanner userPhoneSave = new Scanner(System.in);

                    System.out.println("회원 이름 등록하세요 : ");
                    userName = userNameSave.nextLine();
                    System.out.println("회원 전화번호 등록하세요 : ");
                    userPhone = userPhoneSave.nextInt();

                    String userInfo = ("회원 이름 : " + userName + " 회원 번호 : " + userPhone);
                    System.out.println(userInfo);
                }
                break;
                case 3 : {

                    Book Book = new bookSaved();

                    String bookSavedsName = "룬의 아이들";
                    String bookSavedNumber = "123-55-123ㅎ";
                    String bookSavedspublisher = "(주)아몰랑";
                    System.out.println();
                }
            }
        }

    }


}
