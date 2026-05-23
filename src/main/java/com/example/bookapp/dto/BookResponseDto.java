package com.example.bookapp.dto;

public class BookResponseDto {
    private Long bookId;
    private String bookTitle;
    private String authorName;

    //不要になったら削除
    public Long getBookId() {
        return bookId;
    }
    //不要になったら削除
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
