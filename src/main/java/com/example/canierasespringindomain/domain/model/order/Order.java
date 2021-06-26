package com.example.canierasespringindomain.domain.model.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
    private final Long id;
    private final Long memberId;
    private final List<Long> orderMenuIds;

    private Order() {
        this(null, null, null);
    }
}
