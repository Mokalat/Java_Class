package com.ohgiraffers.order.dao;

import com.ohgiraffers.Application;
import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    public String order(OrderDTO[] order){
        //0
        int oldNum = orders.size();

        for (OrderDTO orderDTO : order) {
            orders.add(orderDTO);
        }

        if(oldNum >= orders.size()){
            return "등록실패";
        }
        return "등록성공";

    }
    public String orderRead(){
        return " " + this.orders;
    }

    public String delete(){
      return "test";
    }


}