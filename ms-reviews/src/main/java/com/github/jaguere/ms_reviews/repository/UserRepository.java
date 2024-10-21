package com.github.jaguere.ms_reviews.repository;

import com.github.jaguere.ms_reviews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
