package com.example.bookapp;

//標準ライブラリ
import java.util.ArrayList;
import java.util.List;

//Spring Bootライブラリ
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookapp.entity.Book;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.title = "葬送のフリーレン";
        book1.author = "山田鐘人";

        Book book2= new Book();
        book2.title = "ダンダダン";
        book2.author = "龍幸伸";

        books.add(book1);
        books.add(book2);

        return books;
    }
}