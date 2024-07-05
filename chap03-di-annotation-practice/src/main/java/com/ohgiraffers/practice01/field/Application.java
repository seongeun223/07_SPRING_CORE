package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.practice01");

        MemberController memberController = context.getBean("memberField", MemberController.class);

        System.out.println(memberController.selectMember());

//        MemberService memberService = context.getBean(MemberService.class);
//
//        Map<Long, MemberDTO> memberMap = memberService.selectMember();
//
//        List<MemberDTO> members = new ArrayList<>(memberMap.values());
//
//        for(MemberDTO member : members) {
//            System.out.print(member);
//        }
    }
}
