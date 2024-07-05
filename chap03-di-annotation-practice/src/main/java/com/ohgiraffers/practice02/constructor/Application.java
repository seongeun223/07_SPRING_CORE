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
}
