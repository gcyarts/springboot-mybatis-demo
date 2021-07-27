package com.example.products.Mapper;

import com.example.products.Dao.Goods;
import com.example.products.Dao.GoodsName;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoodsMapper {
    Goods selectName(String name);
    List<Goods> selectAll();
    List<GoodsName> selectList();
}
