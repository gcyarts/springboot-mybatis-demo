package com.example.products.Controller;

import com.example.products.Dao.Goods;
import com.example.products.Dao.GoodsName;
import com.example.products.Service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;

    //所有商品的详情信息
    @GetMapping(value = "/findAll")
    public List<Goods> findAll() {
        return goodsService.selectAll();
    }

    //通过商品名字查找商品详情
    @GetMapping("/find")
    public Goods findbyname(String name){
        return goodsService.selectName(name);
    }

    //列举出所有商品名字
    @GetMapping(value = "/list")
    public List<GoodsName> findList() {
        return goodsService.selectList();
    }


}
