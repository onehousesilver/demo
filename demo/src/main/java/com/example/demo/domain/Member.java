package com.example.demo.domain;

public class Member {
//id와 이름이 필수로 필요함.
//    시스템에
    private Long id;
//    고객이 회원가입 할 때 적는 이름
    private String name;



    public Long getId() {
        return id;
    }

    public Member setId(Long id) {
        this.id = id;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
