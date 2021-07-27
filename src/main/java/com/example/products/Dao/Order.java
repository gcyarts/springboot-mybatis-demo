package com.example.products.Dao;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Order {
    private Integer id;
    private String username;
    private String ordername;
    private String orderdate;
}
