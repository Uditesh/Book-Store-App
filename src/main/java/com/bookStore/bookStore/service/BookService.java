package com.bookStore.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repo.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	public void save(Book book) {
		bookRepo.save(book);

	}
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bookRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		bookRepo.deleteById(id);
	}
}
