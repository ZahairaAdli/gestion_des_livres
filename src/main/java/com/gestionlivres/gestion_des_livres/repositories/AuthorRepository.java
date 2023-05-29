package com.gestionlivres.gestion_des_livres.repositories;

import com.gestionlivres.gestion_des_livres.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
