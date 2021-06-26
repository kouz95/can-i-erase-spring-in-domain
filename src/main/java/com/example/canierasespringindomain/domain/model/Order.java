package com.example.canierasespringindomain.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Order {
    private final Long id;
    private final Long memberId;
    private final List<Long> menuIds;

    private Order() {
        this(null, null, null);
    }
}
