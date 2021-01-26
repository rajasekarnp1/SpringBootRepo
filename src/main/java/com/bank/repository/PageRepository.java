package com.scb.bank.repository;

import com.scb.bank.entity.Book;
import com.scb.bank.entity.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {

    List<Page> findByBook(Book book, Sort sort);
}
