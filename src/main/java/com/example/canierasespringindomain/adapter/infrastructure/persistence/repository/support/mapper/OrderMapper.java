package com.example.canierasespringindomain.adapter.infrastructure.persistence.repository.support.mapper;

import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaMemberEntity;
import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaOrderEntity;
import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaOrderMenuEntity;
import com.example.canierasespringindomain.domain.model.order.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class OrderMapper {
    public JpaOrderEntity toEntity(Order order) {
        return new JpaOrderEntity(order.getId(), new JpaMemberEntity(order.getMemberId()), new ArrayList<>());
    }

    public Order toDomainModel(JpaOrderEntity jpaOrderEntity) {
        return new Order(jpaOrderEntity.getId(),
                jpaOrderEntity.getMember().getId(),
                jpaOrderEntity.getMenus().stream()
                        .map(JpaOrderMenuEntity::getId)
                        .collect(Collectors.toList()));
    }
}
