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
 
    private Long id;

    private String title;
    private String author;

    private Integer volume;
    private String coverImage;

    public Long getId() {
        return id;
    }

    /*=====タイトル===================================*/
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /*=====著者===================================*/
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    /*=====巻数===================================*/
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /*=====表紙画像===================================*/
    public String getCoverImage() {
        return coverImage;
    }
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
}








