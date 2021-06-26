package com.example.canierasespringindomain.domain.model.menu;

import java.util.Optional;

public interface MenuRepository {
    Menu save(Menu Menu);

    Optional<Menu> findById(Long id);
}
