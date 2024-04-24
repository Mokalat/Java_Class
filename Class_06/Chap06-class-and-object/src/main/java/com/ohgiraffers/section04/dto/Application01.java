package com.ohgiraffers.section04.dto;

import java.util.Date;

public class Application01{
    public static void main(String[] args) {
        UserDTo user = new UserDTo("id", "pwd", "쏭", new Date());
        System.out.println(user);
    }
}
