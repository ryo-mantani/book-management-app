package com.example.bookapp.controller;

//標準ライブラリ
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

//entity、repository、service
import com.example.bookapp.entity.Book;
import com.example.bookapp.service.BookService;

//Spring Boot
import jakarta.validation.Valid;

//DTO
import com.example.bookapp.dto.BookRequestDto;
import com.example.bookapp.dto.BookResponseDto;

@RestController
public class BookController {

    //Service宣言
    private final BookService bookService;

    //コンストラクタ
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //===========================API連携テスト======================================================
     
    //登録
    @PostMapping("/books")
    public ResponseEntity<?> addPostBook(@Valid @RequestBody BookRequestDto request) {
        bookService.addBook(request);
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
        Book book = bookService.deleteBook(id);
        if (book == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("削除完了");

    }

    //更新
    @PutMapping("/books/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @Valid @RequestBody BookRequestDto request) {
        //入力確認
        if (id <= 0){
            return ResponseEntity.badRequest().body("idは1以上を入力してください");
        }

        //id存在確認
        Book book = bookService.updateBook(id, request);
        if (book == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("更新完了");
    }
    
    //id検索
    @GetMapping("/books/{id}")
    public ResponseEntity<?> getBook(@PathVariable Long id){

        //入力確認
        if (id <= 0) {
            return ResponseEntity.badRequest().body("idは1以上を入力してください");
        }

        //id存在確認
        BookResponseDto book = bookService.getBook(id);
        if (book == null) {
            return ResponseEntity.badRequest().body("検索対象の情報がありません。");

        }

        return ResponseEntity.ok(book);
    }

    //一覧表示
    @GetMapping("/books")
    public ResponseEntity<?> getBook(){
        return ResponseEntity.ok(bookService.getBooks());
    }

    //検索（タイトルor著者）
    @GetMapping("/books/search/{keyType}/{keyword}")
    public ResponseEntity<?> searchBook(@PathVariable String keyType, @PathVariable String keyword) {

        //{keyType}の入力チェック
        if (!keyType.equals("title") && !keyType.equals("author")) {
            return ResponseEntity.badRequest().body("title または author を指定してください");
        }
 
        //存在確認
        List<BookResponseDto> books = bookService.searchBook(keyType, keyword);
        if (books.isEmpty()) {
            return ResponseEntity.badRequest().body("検索対象の情報がありません。");

        }

        return ResponseEntity.ok(books);

    }

}