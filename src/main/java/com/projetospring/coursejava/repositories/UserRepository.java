package com.projetospring.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.coursejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
