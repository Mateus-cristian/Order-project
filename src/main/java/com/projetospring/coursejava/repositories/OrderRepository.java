package com.projetospring.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.coursejava.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
