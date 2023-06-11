
package com.gestionlivres.gestion_des_livres.controllers;
import com.gestionlivres.gestion_des_livres.models.Book;
import com.gestionlivres.gestion_des_livres.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
public class BookController {
    @Autowired
    BookService bookservice;

    @RequestMapping("/createBook")
    public String createBook() {
        return "CreateBook";
    }

    @RequestMapping("/saveBook")
    public String saveBook(
            @ModelAttribute("book") Book book,
            @RequestParam("dateJsp") String dateController,
            ModelMap modelMap
    ) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateFormat.parse(String.valueOf(dateController));
        book.setDateBook(dateCreation);
        Book me = bookservice.saveBook(book);
        String messageController = "Book Id: " + me.getIdBook() + "  By the name " + me.getNameBook() + "  is Saved";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateBook";
    }

    @RequestMapping("/booksList")
    public String booksList(ModelMap modelMap) {
        List<Book> booksController = bookservice.getAllBooks();
        modelMap.addAttribute("booksJsp", booksController);
        return "BooksList";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook( @RequestParam("id") Long id ,ModelMap modelMap )
    {
        bookservice.deleteBookById(id);
        List<Book> booksController = bookservice.getAllBooks();
        modelMap.addAttribute("booksJsp", booksController);
        return "BooksList";
    }

    @RequestMapping("/showBook")

    public String showBook( @RequestParam("id") Long id ,ModelMap modelMap ){
        Book booksController = bookservice.getBook(id);
        modelMap.addAttribute("booksJsp",booksController);
        return "EditBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook (
            @ModelAttribute("book") Book book,
            @RequestParam("dateJsp") String dateController
    ) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateFormat.parse(String.valueOf(dateController));
        book.setDateBook(dateCreation);
        return "CreateBook";
    }

    }





