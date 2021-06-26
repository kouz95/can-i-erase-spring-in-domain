package com.example.canierasespringindomain.domain.model.ordermenu;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderMenu {
    private final Long id;
    private final Long orderId;
    private final Long menuId;

    private OrderMenu() {
        this(null, null, null);
    }
}
