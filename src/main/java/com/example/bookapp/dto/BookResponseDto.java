package com.example.bookapp.dto;

public class BookResponseDto {
    private Long bookId;
    private String bookTitle;
    private String authorName;
    private Integer bookVolume;
    private String coverImage;

    
    public Long getBookId() {
        return bookId;
    }
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

    public Integer getBookVolume() {
        return bookVolume;
    }
    public void setBookVolume(Integer bookVolume) {
        this.bookVolume = bookVolume;
    }
    
    public String getCoverImage() {
        return coverImage;
    }
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }


}
