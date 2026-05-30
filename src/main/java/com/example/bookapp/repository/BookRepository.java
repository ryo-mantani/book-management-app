package com.example.bookapp.repository;

//Entity管理用
import com.example.bookapp.entity.Book; 
//SpringBoot
import org.springframework.data.jpa.repository.JpaRepository; 

//List
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByOrderByIdDesc();//一覧表示：降順

    List<Book> findByTitleContainingAndAuthorContainingOrderByIdDesc(String title, String author);//タイトル、著者検索
    
    List<Book> findByTitleContainingOrderByIdDesc(String title);//タイトル検索

    List<Book> findByAuthorContainingOrderByIdDesc(String author);//著者検索



}
