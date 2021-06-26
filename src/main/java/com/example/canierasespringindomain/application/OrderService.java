package com.example.canierasespringindomain.application;

import com.example.canierasespringindomain.domain.model.order.Order;
import com.example.canierasespringindomain.domain.model.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
