package com.example.bookapp;

//標準ライブラリ
//import java.util.ArrayList;
import java.util.List;


//Spring Bootライブラリ
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

//Webアノテーション群
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

//entity、repository
import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    //===========================画面テスト======================================================
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
    public ResponseEntity<?> addPostBook(@RequestBody Book request) {
        bookRepository.save(request);
        return ResponseEntity.ok("登録完了");
    }
    

   //削除
    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        //入力確認
        if (id <= 0){
            return ResponseEntity.badRequest().body("idは1以上を入力してください");
        }

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            return ResponseEntity.notFound().build();
        }

        //削除
        bookRepository.deleteById(id);
        return ResponseEntity.ok("削除完了");

    }

    //更新
    @PutMapping("/books/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book request) {
        //入力確認
        if (id <= 0){
            return ResponseEntity.badRequest().body("idは1以上を入力してください");
        }

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            return ResponseEntity.notFound().build();
        }

        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());

        bookRepository.save(book);
        return ResponseEntity.ok("更新完了");
    }
    
    //id検索
    @GetMapping("/books/{id}")
    public ResponseEntity<?> getBook(@PathVariable Long id){
        
        //入力確認
        if (id <= 0){
            return ResponseEntity.badRequest().body("idは1以上を入力してください");
        }

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(book);

    }

}