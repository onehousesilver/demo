package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
//    save 하면 회원이 저장
    Member save(Member member);
//    id로 회원 찾는것
    Optional<Member> findById(Long id);
//    없으면 null을 반환 (optional로 감싸서 반환)
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
