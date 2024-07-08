package com.ohgiraffers.common;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private final List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    // 쇼핑카트에 담긴 물건들을 리턴해주는 메소드
    public List<Product> getItem() {
        return items;
    }
}
