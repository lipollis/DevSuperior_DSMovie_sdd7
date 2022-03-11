package com.devsuperior.dsmoviesdd7.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {
    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    // CONSTRUTOR VAZIO
    public User() {}

    // CONSTRUTOR
    public User(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    // GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
