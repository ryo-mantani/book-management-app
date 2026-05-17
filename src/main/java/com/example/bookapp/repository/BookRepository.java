package com.example.bookapp.repository;

//Entity管理用
import com.example.bookapp.entity.Book; 
//SpringBoot
import org.springframework.data.jpa.repository.JpaRepository; 

public interface BookRepository extends JpaRepository<Book, Long> {

}
