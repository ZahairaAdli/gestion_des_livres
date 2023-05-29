package com.gestionlivres.gestion_des_livres.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @RequestMapping("/createBook")
    public  String createBook(){
        return "CreateBook";
    }
}
