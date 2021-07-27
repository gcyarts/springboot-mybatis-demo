package com.example.products.Service;

import com.example.products.Dao.Order;
import com.example.products.Dao.OrderList;
import com.example.products.Mapper.Ordermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private Ordermapper ordermapper;
    @Override
    public List<OrderList> selectName(String username) {
        return ordermapper.selectName(username);
    }

    @Override
    public List<Order> selectDetail(Integer id) {
        return ordermapper.selectDetail(id);
    }

    @Override
    public int insertOrder(Order order) {
       return ordermapper.insertOrder(order);
    }
}
