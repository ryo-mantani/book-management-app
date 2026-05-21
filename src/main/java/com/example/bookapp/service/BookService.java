package com.example.bookapp.service;


//標準ライブラリ
import java.util.List;

//Webアノテーション群
import org.springframework.stereotype.Service;


//entity、repository、service
import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;
import com.example.bookapp.dto.BookRequestDto;

@Service
public class BookService {

    //Repository
    private final BookRepository bookRepository;
    //コンストラクタ
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //登録
    public Book addBook(BookRequestDto request){

        Book book = new Book();
        book.setTitle(request.getBookTitle());
        book.setAuthor(request.getAuthorName());

        return bookRepository.save(book);
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
    public Book updateBook(Long id, BookRequestDto request){

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            return null;
        }

        book.setTitle(request.getBookTitle());
        book.setAuthor(request.getAuthorName());

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
    
    //著者orタイトル検索
    public List<Book> searchBook(String keyType, String keyword){

        switch (keyType) {
            case "title":
                return bookRepository.findByTitle(keyword);

            case "author":
                return bookRepository.findByAuthor(keyword);

            default:
                return List.of();

        }

    }


}
