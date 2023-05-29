package com.gestionlivres.gestion_des_livres;

import com.gestionlivres.gestion_des_livres.models.Author;
import com.gestionlivres.gestion_des_livres.models.Book;
import com.gestionlivres.gestion_des_livres.models.Category;
import com.gestionlivres.gestion_des_livres.models.Member;
import com.gestionlivres.gestion_des_livres.repositories.AuthorRepository;
import com.gestionlivres.gestion_des_livres.repositories.BookRepository;
import com.gestionlivres.gestion_des_livres.repositories.CategoryRepository;
import com.gestionlivres.gestion_des_livres.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


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
	public void TestUpdateBook(){
		Book book= bookRepository.findById(1L).get();
		book.setPrixBook(250.00);
		bookRepository.save(book);
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


	@Autowired
	CategoryRepository categoryRepository;

	@Test
	public void TestCreateCategory() {
		Category category= new Category("romantic",new Date());
		categoryRepository.save(category);
	}
	@Test
	public void TestUpdateCategory()
	{
		Category category=categoryRepository.findById(1L).get();
		category.setNameCategory("History");
		categoryRepository.save(category);
	}

	@Test
	public void TestFindCategoryById(){
		Category category= categoryRepository.findById(1L).get();
		System.out.println(category);

	}

	@Test
	public void TestFindAllCategories(){
		List<Category> categories=categoryRepository.findAll();
		categories.forEach(System.out::println);
	}

	@Test
	public void TestDeleteCategoryById(){

		categoryRepository.deleteById(1L);
	}

	@Test
	public void TestDeleteAllCategories(){
		categoryRepository.deleteAll();
	}

	@Autowired

	MemberRepository memberRepository;

	@Test
	 public  void TestCreateMember()
	{
		Member member= new Member("amine","homme", new Date(),new Date());
		memberRepository.save(member);
	}

	@Test
	public void TestFindMemberById(){
		Member member= memberRepository.findById(1L).get();
		System.out.println(member);
	}

	@Test
	public void TestUpdateMember()
	{
		Member member=memberRepository.findById(1L).get();
		member.setNameMember("hamza");
		memberRepository.save(member);
	}

	@Test
	public void TestFindAllMembers(){
		List<Member> members=memberRepository.findAll();
		members.forEach(System.out::println);
	}

	@Test
	public void TestDeleteMemberById(){

		memberRepository.deleteById(1L);
	}

	@Test

	public void TestDeleteAllMembers(){
		memberRepository.deleteAll();
	}

	@Autowired
	AuthorRepository authorRepository;

	@Test
	public  void TestCreateAuthor()
	{
		Author author=new Author("charle",new Date());
		authorRepository.save(author);
	}

	@Test
	public void TestUpdateAuthor()
	{
		Author author=authorRepository.findById(1L).get();
		author.setNameAuthor("hamza");
		authorRepository.save(author);
	}







}
