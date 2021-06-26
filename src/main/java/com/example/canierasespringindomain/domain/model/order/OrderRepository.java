package com.example.canierasespringindomain.domain.model.order;

public interface OrderRepository {
    Order save(Order order);

    Order findById(Long id);
}
