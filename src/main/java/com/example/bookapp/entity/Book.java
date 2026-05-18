package com.example.bookapp.entity;

// JPAライブラリ Entity管理用
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//本情報テーブル
@Entity
public class Book {
 
    @Id//主キー
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自動採番
 
    private long id;

    private String title;
    private String author;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}








