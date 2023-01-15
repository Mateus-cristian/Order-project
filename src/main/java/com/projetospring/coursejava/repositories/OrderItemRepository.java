package com.projetospring.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.coursejava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
