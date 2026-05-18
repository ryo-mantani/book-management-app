package com.example.bookapp;

//標準ライブラリ
import java.util.ArrayList;
import java.util.List;


//Spring Bootライブラリ
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //登録
    @GetMapping("/add")
    public String addBook() {
        Book book1 = new Book();
        book1.title = "葬送のフリーレン";
        book1.author = "山田鐘人";

        Book book2= new Book();
        book2.title = "ダンダダン";
        book2.author = "龍幸伸";

        bookRepository.save(book1);
        bookRepository.save(book2);

        return "登録完了";
    }  

    //一覧
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }



}