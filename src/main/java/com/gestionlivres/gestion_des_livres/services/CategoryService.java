package com.gestionlivres.gestion_des_livres.services;

import com.gestionlivres.gestion_des_livres.models.Book;
import com.gestionlivres.gestion_des_livres.models.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(Category category);
    Category updateCategory(Category category);
    Category getCategory(Long id);
    List<Category> getAllCategories();
    void deleteCategoryById(Long id);
    void deleteAllCategories();
}
