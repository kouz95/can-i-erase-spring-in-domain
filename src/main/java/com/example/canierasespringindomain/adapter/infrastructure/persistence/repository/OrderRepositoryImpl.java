package com.example.canierasespringindomain.adapter.infrastructure.persistence.repository;

import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.entity.JpaOrderEntity;
import com.example.canierasespringindomain.adapter.infrastructure.persistence.jpa.repository.JpaOrderRepository;
import com.example.canierasespringindomain.adapter.infrastructure.persistence.repository.support.mapper.OrderMapper;
import com.example.canierasespringindomain.domain.model.order.Order;
import com.example.canierasespringindomain.domain.model.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final JpaOrderRepository jpaOrderRepository;
    private final OrderMapper orderMapper;

    @Override
    public Order save(Order order) {
        JpaOrderEntity saved = jpaOrderRepository.save(orderMapper.toEntity(order));
        return orderMapper.toDomainModel(saved);
    }

    @Override
    public Order findById(Long id) {
        JpaOrderEntity jpaOrderEntity = jpaOrderRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return orderMapper.toDomainModel(jpaOrderEntity);
    }
}
