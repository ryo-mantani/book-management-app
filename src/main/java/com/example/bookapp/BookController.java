package com.example.bookapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book getBook() {

        Book book = new Book();

        book.title = "葬送のフリーレン";
        book.author = "山田鐘人";

        return book;
    }
}