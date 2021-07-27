package com.example.products.Mapper;

import com.example.products.Dao.Order;
import com.example.products.Dao.OrderList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Ordermapper {
    List<OrderList> selectName(String username);
    List<Order> selectDetail(Integer id);
    int insertOrder(Order order);
}
