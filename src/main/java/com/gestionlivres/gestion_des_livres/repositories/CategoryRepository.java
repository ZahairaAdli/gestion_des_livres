package com.gestionlivres.gestion_des_livres.repositories;

import com.gestionlivres.gestion_des_livres.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
