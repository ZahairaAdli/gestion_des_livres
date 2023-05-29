package com.gestionlivres.gestion_des_livres.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCategory;
    private Date dateCategory;

    public Category(){
        super();
    }

    public Category(String nameCategory, Date dateCategory) {
        this.nameCategory = nameCategory;
        this.dateCategory = dateCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Date getDateCategory() {
        return dateCategory;
    }

    public void setDateCategory(Date dateCategory) {
        this.dateCategory = dateCategory;
    }
}
