package com.ohgiraffers.section01.list.run;

import java.util.*;
import java.util.List;

public class Application01 {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        alist.add("apple");
        alist.add(213);
        alist.add("banana");
        alist.add(new Date());
        System.out.println(alist);



        System.out.println("변경 테스트");
        // list의 길이를 확인할 때 size를 이용한다.
        System.out.println(alist.size());

        System.out.println();
        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
           System.out.println(alist.get(i));
        }
        String targer = (String) alist.get(0);
        targer="안녕";

        // 다른방법
        // System.out.println(alist.get(0));

        // 특정 인덱스의 값을 추가한다.
        alist.add(0,targer);
        System.out.println(alist.get(0));




        System.out.println();
        System.out.println("삭제 구분");
        alist.remove(0);
        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        System.out.println();
        //값을 수정한다
        alist.set(0,"이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }


        // String 으로 지정해서 맞는 타입으로 적용해야한다
        List<String> stringsList = new ArrayList<>();
        stringsList.add("apple");
        stringsList.add("orange");
        stringsList.add("mango");
        stringsList.add("grape");
        System.out.println();
        System.out.println(stringsList);

        // Collections은 알파벳으로 순서 정렬 (원본 배열에 영량을 준다)
        // sort는 오름차수다
        Collections.sort(stringsList);
        System.out.println(stringsList);

        System.out.println();
        stringsList = new LinkedList<>(stringsList);
        /*
            Iterator란?
            Collection 인터페이스의 interator()메소드를 이용해서 인스턴스를 생성할 수 있다.
            컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용된다.
            반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
            인덱스로 관리되는 컬렉션이 아닌 경우에은 반복문을 사용해서 요소에 하나씩 접근할 수 없기 떄문에
            인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
            hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
            next : 다음 요소를 반환
        */
        Iterator<String> dIter=((LinkedList<String>)stringsList).descendingIterator();

       /*
       while(dIter.hasNext()){
            System.out.println(dIter.next());
        }
        System.out.println(dIter);
       */

        List<String> descList =new ArrayList<>();
        while(dIter.hasNext()){
            descList.add(dIter.next());
        }
        for (int i = 0; i < descList.size(); i++) {
            System.out.println(descList.get(i));
        }
    }
}
