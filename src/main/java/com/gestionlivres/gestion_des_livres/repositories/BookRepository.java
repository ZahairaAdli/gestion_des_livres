package com.gestionlivres.gestion_des_livres.repositories;

import com.gestionlivres.gestion_des_livres.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
