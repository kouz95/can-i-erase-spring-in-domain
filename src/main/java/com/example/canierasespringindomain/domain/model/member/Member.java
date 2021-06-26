package com.example.canierasespringindomain.domain.model.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
    private final Long id;
    private String name;

    private Member() {
        this(null, null);
    }

    public Member changeName(String name) {
        this.name = name;
        return this;
    }
}
