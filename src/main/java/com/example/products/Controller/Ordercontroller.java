package com.example.products.Controller;

import com.example.products.Dao.Order;
import com.example.products.Dao.OrderList;
import com.example.products.Dao.User;
import com.example.products.Service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Ordercontroller {
    @Autowired
    private OrderServiceImpl orderService;
    //订单列表
    @GetMapping(value = "/list")
    public List<OrderList> findlist(String name) {
        return orderService.selectName(name);
    }
    //根据id查询订单细节
    @GetMapping(value = "/detail")
    public List<Order> findDetail(Integer id) {
        return orderService.selectDetail(id);
    }
    @PostMapping("/add")
    public int addOrder(@RequestBody Order order){

        int stat = orderService.insertOrder(order);
        return stat;
    }
}
