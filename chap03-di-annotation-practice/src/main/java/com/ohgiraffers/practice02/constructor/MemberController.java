package com.ohgiraffers.practice02.constructor;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Map;

@Controller("memberController")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public Map<Long, MemberDTO> selectMember() {
        return memberService.selectMember();
    }
}
