package com.ohgiraffers.common;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private String name;    // 상품명
    private int price;      // 상품가격
}
