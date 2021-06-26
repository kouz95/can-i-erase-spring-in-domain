package com.example.canierasespringindomain.application;

import com.example.canierasespringindomain.domain.model.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    void save() {
        Member saved = memberService.save(new Member(null, "name"));

        assertThat(saved.getId()).isNotNull();
        assertThat(saved.getName()).isEqualTo("name");
    }

    @Test
    void findById() {
        Member saved = memberService.save(new Member(null, "name"));

        Member find = memberService.findById(saved.getId());

        assertThat(find.getId()).isNotNull();
        assertThat(find.getName()).isEqualTo("name");
    }
}