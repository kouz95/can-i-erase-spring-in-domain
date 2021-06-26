package com.example.canierasespringindomain.adapter.infrastructure.persistence.repository;

import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaMemberEntity;
import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.repository.JpaMemberRepository;
import com.example.canierasespringindomain.adapter.infrastructure.persistence.repository.support.mapper.MemberMapper;
import com.example.canierasespringindomain.domain.model.member.Member;
import com.example.canierasespringindomain.domain.model.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MemberRepositoryImpl implements MemberRepository {
    private final JpaMemberRepository jpaMemberRepository;
    private final MemberMapper memberMapper;

    @Override
    public Member save(Member member) {
        JpaMemberEntity saved = jpaMemberRepository.save(memberMapper.toEntity(member));
        return memberMapper.toDomainModel(saved);
    }

    @Override
    public Member findById(Long id) {
        JpaMemberEntity jpaMemberEntity = jpaMemberRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return memberMapper.toDomainModel(jpaMemberEntity);
    }
}
