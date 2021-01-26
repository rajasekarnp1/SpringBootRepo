package com.scb.bank.repository;

import com.scb.bank.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
 

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByIsbn(String isbn);
}
