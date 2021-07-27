package com.example.products.Service;

import com.example.products.Dao.Order;
import com.example.products.Dao.OrderList;

import java.util.List;

public interface OrderService {
    List<OrderList> selectName(String username);
    List<Order> selectDetail(Integer id);
    int insertOrder(Order order);
}
