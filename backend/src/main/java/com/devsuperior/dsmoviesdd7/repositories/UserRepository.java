package com.devsuperior.dsmoviesdd7.repositories;

import com.devsuperior.dsmoviesdd7.entities.Movie;
import com.devsuperior.dsmoviesdd7.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // BUSCAR NO BANCO DE DADOS POR EMAIL
    User findByEmail(String email);
}
