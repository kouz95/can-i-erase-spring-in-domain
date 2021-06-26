package com.example.canierasespringindomain.domain.model.member;

public interface MemberRepository {
    Member save(Member member);

    Member findById(Long id);
}
