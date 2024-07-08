package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true) // callSuper = true 부모클래스에 있는 속성까지 ToString에 넣어주겠다.
public class Bread extends Product{

    private LocalDate bakedDate; // 생산시간

    // 부모클래스까지 초기화하는 생성자
    public Bread(String name, int price, LocalDate bakedDate) {

        super(name, price); // 부모클래스의 생성자
        this.bakedDate = bakedDate;
    }
}
