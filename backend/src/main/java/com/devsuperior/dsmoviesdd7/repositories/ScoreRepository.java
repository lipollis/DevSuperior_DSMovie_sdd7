package com.devsuperior.dsmoviesdd7.repositories;

import com.devsuperior.dsmoviesdd7.entities.Movie;
import com.devsuperior.dsmoviesdd7.entities.Score;
import com.devsuperior.dsmoviesdd7.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
