package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long>{
}
