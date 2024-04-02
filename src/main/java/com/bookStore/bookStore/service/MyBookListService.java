package com.bookStore.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.repo.MyBooksRepo;

@Service
public class MyBookListService {

	@Autowired
	private MyBooksRepo myBookRepo;
	
	public void saveMyBook(MyBookList myBookList) {
		myBookRepo.save(myBookList);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBookRepo.findAll();
	}
	
	public void deleteById(int id) {
		myBookRepo.deleteById(id);
	}
	
}
