package com.example.demo.controller;


import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
//    final -> 무언가를 제한한다
//    변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미
//    수정 할 수 없다 -> 변수의 값에 한정
    private final MemberService memberService;


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
