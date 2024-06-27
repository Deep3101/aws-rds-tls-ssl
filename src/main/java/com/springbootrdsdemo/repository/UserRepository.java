package com.springbootrdsdemo.repository;

import com.springbootrdsdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
