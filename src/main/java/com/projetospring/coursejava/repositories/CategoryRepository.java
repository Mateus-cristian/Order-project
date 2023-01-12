package com.projetospring.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.coursejava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
