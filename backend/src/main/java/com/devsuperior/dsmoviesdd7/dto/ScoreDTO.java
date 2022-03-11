package com.devsuperior.dsmoviesdd7.dto;

public class ScoreDTO {

    // ATRIBUTOS
    private Long movieId;
    private String email;
    private Double score;

    // CONSTRUTOR
    public ScoreDTO() {
    }

    // GETTER E SETTER
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
