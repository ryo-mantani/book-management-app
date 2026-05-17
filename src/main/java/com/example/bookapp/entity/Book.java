package com.example.bookapp.entity;

// JPAライブラリ Entity管理用
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//本情報テーブル
@Entity
public class Book {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private long id;
    public String title;
    public String author;

}