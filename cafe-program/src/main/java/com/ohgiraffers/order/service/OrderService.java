package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.io.OptionalDataException;

public class OrderService {

     private final OrderRepository orderRepository = new OrderRepository();

    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.
    public String order(OrderDTO[] orders){
//        if(!orderDTO.getMenuName().equals("아메리카노")){
//            return "주문 실패";
//        }
        for (OrderDTO orderDTO : orders) {
            if(orderDTO.getMenuName().equals(" ")){
                return "주문 실패";
            }
            if(orderDTO.getPrice() <= 0){
                return "땅파서 장사하냐?";
            }
        }

        String result = orderRepository.order(orders);
        return result;

    }

    public String orderRead(){

        orderRepository.orderRead();
        return orderRepository.orderRead();
    }

    public String Delete(){
        String Delete = orderRepository.delete();
        return orderRepository.delete();

    }

}