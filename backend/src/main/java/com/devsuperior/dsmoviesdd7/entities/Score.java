package com.devsuperior.dsmoviesdd7.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
    // ATRIBUTOS
    @EmbeddedId
    private ScorePK id = new ScorePK();

    private Double value;

    // CONSTRUTOR VAZIO
    public Score() {}

    // MÉTODO PARA INFORMAR UM FILME E ASSOCIAR COM O SCORE
    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    // GETTERS E SETTERS
    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
