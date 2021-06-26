package com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.repository;

import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderRepository extends JpaRepository<JpaOrderEntity, Long> {
}
