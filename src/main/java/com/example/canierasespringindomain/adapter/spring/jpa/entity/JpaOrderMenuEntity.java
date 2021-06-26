package com.example.canierasespringindomain.adapter.spring.jpa.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "order_menu")
public class JpaOrderMenuEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private JpaOrderEntity order;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private JpaMenuEntity menu;
}
