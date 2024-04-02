package com.bookStore.bookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.bookStore.entity.MyBookList;

@Repository
public interface MyBooksRepo extends JpaRepository<MyBookList, Integer>{

}
