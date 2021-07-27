package com.example.products.Service;

import com.example.products.Dao.Goods;
import com.example.products.Dao.GoodsName;


import java.util.List;

public interface GoodsService {
    Goods selectName(String name);
    List<Goods> selectAll();
    List<GoodsName> selectList();
}
