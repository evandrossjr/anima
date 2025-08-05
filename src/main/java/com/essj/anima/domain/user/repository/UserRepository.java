package com.essj.anima.domain.user.repository;

import com.essj.anima.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
