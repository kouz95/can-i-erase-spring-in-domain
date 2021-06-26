package com.example.canierasespringindomain.domain.model.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Menu {
    private final Long id;
    private String title;

    private Menu() {
        this(null, null);
    }

    public Menu changeTitle(String title) {
        this.title = title;
        return this;
    }
}
