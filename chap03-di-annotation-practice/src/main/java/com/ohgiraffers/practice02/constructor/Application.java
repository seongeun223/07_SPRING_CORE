package com.ohgiraffers.practice02.constructor;

import com.ohgiraffers.common.MemberDTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.practice02.constructor");

        MemberController memberController = context.getBean("memberController",MemberController.class);

        System.out.println(memberController.selectMember());
    }

    // constructor 사용 -> 계속 constructor 사용하는 것이 좋다.
    /*
    * constructor는 객체가 생성될 때 초기화 작업을 수행한다.
    * 즉, 객체의 초기 상태를 설정하는 역할을 한다.
    * setter는 이미 생성된 객체의 속성을 변경할 때 사용된다.
    * 이 둘을 혼용하면 객체의 초기화와 변경이 혼동될 수 있어 코드의 가독성과 유지보수성이 떨어진다.
    * */
}
