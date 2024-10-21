package com.github.jaguere.ms_reviews.repository;

import com.github.jaguere.ms_reviews.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme,Long> {
}
