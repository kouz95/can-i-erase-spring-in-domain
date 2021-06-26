package com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.repository;

import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberRepository extends JpaRepository<JpaMemberEntity, Long> {
}
