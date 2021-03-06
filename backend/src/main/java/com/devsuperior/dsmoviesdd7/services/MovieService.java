package com.devsuperior.dsmoviesdd7.services;

import com.devsuperior.dsmoviesdd7.dto.MovieDTO;
import com.devsuperior.dsmoviesdd7.entities.Movie;
import com.devsuperior.dsmoviesdd7.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    // COMPOSIÇÃO
    @Autowired
    private MovieRepository movieRepository;

    // MÉTODO PARA BUSCAR TODOS OS FILMES
    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    // MÉTODO PARA BUSCAR FILMES POR ID
    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie result = movieRepository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
}
