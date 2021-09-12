package com.nitin.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nitin.assignment.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
