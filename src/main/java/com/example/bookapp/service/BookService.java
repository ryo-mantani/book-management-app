package com.example.bookapp.service;

//標準ライブラリ
import java.util.ArrayList;
import java.util.List;

//Webアノテーション群
import org.springframework.stereotype.Service;

import com.example.bookapp.entity.Book;
import com.example.bookapp.repository.BookRepository;
import com.example.bookapp.dto.BookRequestDto;
import com.example.bookapp.dto.BookResponseDto;
import com.example.bookapp.exception.BookNotFoundException;

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
        book.setVolume(request.getBookVolume());
        book.setCoverImage(request.getCoverImage());

        return bookRepository.save(book);
    }

    //削除
    public void deleteBook(Long id){

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throw new BookNotFoundException("該当のidがありません。");
        }

        //削除
        bookRepository.deleteById(id);
  
    }

     //更新
    public void updateBook(Long id, BookRequestDto request){

        //id存在確認
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throw new BookNotFoundException("該当のidがありません。");
        }

        book.setTitle(request.getBookTitle());
        book.setAuthor(request.getAuthorName());
        book.setVolume(request.getBookVolume());
        book.setCoverImage(request.getCoverImage());

        bookRepository.save(book);
  
    }


    //id検索
    public BookResponseDto getBook(Long id){
        
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throw new BookNotFoundException("該当のidがありません。");
        }

        return toResponseDto(book);
    }

    //一覧
    public List<BookResponseDto> getBooks(){
        List<BookResponseDto> bookResponses = new ArrayList<>();
        List<Book> books = bookRepository.findAllByOrderByIdDesc();//降順
        
        for (Book book:books){
            bookResponses.add(toResponseDto(book));
        }
        
        return bookResponses;//配列で返す

    }   
    
    //著者orタイトル検索
    public List<BookResponseDto> searchBook(String title, String author){
       
        List<Book> books;

        if (!title.isEmpty() && !author.isEmpty()) {
            books = bookRepository.findByTitleContainingAndAuthorContainingOrderByIdDesc(title, author);//and検索

        } else if (!title.isEmpty()) {
            books = bookRepository.findByTitleContainingOrderByIdDesc(title);//タイトル検索

        } else if (!author.isEmpty()) {
            books = bookRepository.findByAuthorContainingOrderByIdDesc(author);//著者検索

        } else {
            return getBooks();
        }

        List<BookResponseDto> bookResponses = new ArrayList<>();

        for (Book book:books){
            bookResponses.add(toResponseDto(book));
        } 
        
        return bookResponses;//配列で返す
    }


    //Book(Entity)をBookResponseDtoへ変換
    private BookResponseDto toResponseDto(Book book) {
        BookResponseDto bookResponse = new BookResponseDto();

        bookResponse.setBookId(book.getId());
        bookResponse.setBookTitle(book.getTitle());
        bookResponse.setAuthorName(book.getAuthor());
        bookResponse.setBookVolume(book.getVolume());
        bookResponse.setCoverImage(book.getCoverImage());

        return bookResponse;

    }

}
