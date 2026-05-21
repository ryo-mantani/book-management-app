package com.example.bookapp.service;


//標準ライブラリ
import java.util.List;

import org.springframework.http.ResponseEntity;
//Webアノテーション群
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

//entity、repository、service
import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;

@Service
public class BookService {

    //Repository
    private final BookRepository bookRepository;
    //コンストラクタ
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //登録
    public Book addBook(Book request){
        return bookRepository.save(request);
    }

    //削除
    public Book deleteBook(Long id){

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            return null;
        }

        //削除
        bookRepository.deleteById(id);
        return book;
    }

     //更新
    public Book updateBook(Long id, Book request){

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            return null;
        }

        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());

        return bookRepository.save(book);
  
    }


    //id検索
    public Book getBook(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    //一覧
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
    



}
