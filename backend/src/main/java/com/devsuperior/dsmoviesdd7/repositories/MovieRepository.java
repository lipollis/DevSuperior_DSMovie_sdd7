package com.devsuperior.dsmoviesdd7.repositories;

import com.devsuperior.dsmoviesdd7.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
