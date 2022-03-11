package com.devsuperior.dsmoviesdd7.services;

import com.devsuperior.dsmoviesdd7.dto.MovieDTO;
import com.devsuperior.dsmoviesdd7.dto.ScoreDTO;
import com.devsuperior.dsmoviesdd7.entities.Movie;
import com.devsuperior.dsmoviesdd7.entities.Score;
import com.devsuperior.dsmoviesdd7.entities.User;
import com.devsuperior.dsmoviesdd7.repositories.MovieRepository;
import com.devsuperior.dsmoviesdd7.repositories.ScoreRepository;
import com.devsuperior.dsmoviesdd7.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){
        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        // PERCORRE TODAS AS AVALIAÇÕES E SOMA OS VALORES
        for (Score s : movie.getScores()){
            sum = sum + s.getValue();
        }

        // MÉDIA DE TODAS AS NOTAS
        double avg = sum /movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);
    }
}
