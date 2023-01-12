package com.projetospring.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.coursejava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
