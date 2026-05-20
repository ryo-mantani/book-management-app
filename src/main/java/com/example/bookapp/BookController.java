package com.example.bookapp;

//標準ライブラリ
//import java.util.ArrayList;
import java.util.List;


//Spring Bootライブラリ
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Webアノテーション群
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    //===========================画面テスト======================================================
    /*
    //登録
    @GetMapping("/add")
    public String addBook() {
        Book book1 = new Book();
        book1.setTitle("葬送のフリーレン");
        book1.setAuthor("山田鐘人");

        Book book2= new Book();
        book2.setTitle("ダンダダン");
        book2.setAuthor("龍幸伸");

        bookRepository.save(book1);
        bookRepository.save(book2);

        return "登録完了";
    }  
    

    //一覧
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepository.findAllByOrderByIdDesc();
    }

    //削除
    
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        if (id <= 0){
            return "idは1以上を入力してください";
        }

        bookRepository.deleteById(id);
        return "削除完了";
    }
    

    //更新
    @GetMapping("/update/{id}")
    public String updateBook(@PathVariable Long id) {
        if (id <= 0){
            return "idは1以上を入力してください";
        }

        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            return "対象の本が見つかりません";
        }

        book.setTitle("更新Title");
        book.setAuthor("更新Author");

        bookRepository.save(book);
        return "更新完了";
    }
    */

    //検索（タイトルor著者）
    @GetMapping("/books/search/{keyType}/{keyword}")
    public List<Book> searchBooks(@PathVariable String keyType, @PathVariable String keyword) {

        if (keyType.equals("title")) {
            return bookRepository.findByTitle(keyword);
        }

        if (keyType.equals("author")) {
            return bookRepository.findByAuthor(keyword);
        }

        return List.of();

    }

    //===========================API連携テスト======================================================
    //登録
    @PostMapping("/books")
    public Book addPostBook(@RequestBody Book book) {

        return bookRepository.save(book);
    }

   //削除
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id) {
        if (id <= 0){
            return "idは1以上を入力してください";
        }

        bookRepository.deleteById(id);
        return "削除完了";
    }

    //更新
    @PutMapping("/books/{id}")
    public String updateBook(@PathVariable Long id) {
        if (id <= 0){
            return "idは1以上を入力してください";
        }

        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            return "対象の本が見つかりません";
        }

        book.setTitle("更新Title");
        book.setAuthor("更新Author");

        bookRepository.save(book);
        return "更新完了";
    }

    @GetMapping("/books/{id}")
    public Book getBooks(@PathVariable Long id) {
        if (id <= 0){
            return null;
        }

        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            return null;
        }

        return book;
    }

}