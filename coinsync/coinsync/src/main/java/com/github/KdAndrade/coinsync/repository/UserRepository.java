package com.github.KdAndrade.coinsync.repository;

import com.github.KdAndrade.coinsync.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
