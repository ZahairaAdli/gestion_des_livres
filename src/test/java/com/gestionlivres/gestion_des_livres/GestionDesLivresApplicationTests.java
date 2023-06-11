package com.gestionlivres.gestion_des_livres;

import com.gestionlivres.gestion_des_livres.models.Book;
import com.gestionlivres.gestion_des_livres.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class GestionDesLivresApplicationTests {
	@Autowired
	BookRepository bookRepository;
	@Test
	public void TestcreateBook(){
		Book book= new Book("think to be rich",200.00,new Date());
		bookRepository.save(book);
	}
	@Test
	public void TestUpdateBook() {
		Optional<Book> optionalBook = bookRepository.findById(1L);
		if (optionalBook.isPresent()) {
			Book book = optionalBook.get();
			book.setPrixBook(250.00);
			bookRepository.save(book);
			System.out.println("Book with ID 1 updated successfully");
		} else {
			System.out.println("Book with ID 1 not found");
		}
	}

	@Test
	public void TestFindBookById()
	{
		Book book= bookRepository.findById(1L).get();
		System.out.println(book);
	}

	@Test
	public void TestFindAllBooks()
	{
		List<Book> books=bookRepository.findAll();
		/*for (Book b:books){
			System.out.println(b);}*/
		books.forEach(System.out::println);

	}
	@Test
	public void TestDeleteBookById(){

		bookRepository.deleteById(1L);
	}

	@Test
	public void TestDeleteAllBooks(){
		bookRepository.deleteAll();
	}


}
