package com.example.canierasespringindomain.adapter.infrastructure.persistence.repository.support.mapper;

import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaMemberEntity;
import com.example.canierasespringindomain.domain.model.member.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    public JpaMemberEntity toEntity(Member member) {
        return new JpaMemberEntity(member.getId(), member.getName());
    }

    public Member toDomainModel(JpaMemberEntity jpaMemberEntity) {
        return new Member(jpaMemberEntity.getId(), jpaMemberEntity.getName());
    }
}
