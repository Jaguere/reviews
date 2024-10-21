package com.github.jaguere.ms_reviews.repository;

import com.github.jaguere.ms_reviews.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
