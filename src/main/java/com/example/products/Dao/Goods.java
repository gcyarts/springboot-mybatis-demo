package com.example.products.Dao;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Goods {
    private String name;
    private String price;
    private String introduction;
}
