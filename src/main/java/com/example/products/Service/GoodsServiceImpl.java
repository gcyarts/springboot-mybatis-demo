package com.example.products.Service;


import com.example.products.Dao.Goods;
import com.example.products.Dao.GoodsName;
import com.example.products.Mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements  GoodsService {
    @Autowired
    private GoodsMapper goodsmapper;

    @Override
    public Goods selectName(String name) {
        return goodsmapper.selectName(name);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsmapper.selectAll();
    }

    @Override
    public List<GoodsName> selectList() {
       return goodsmapper.selectList();
    }
}
