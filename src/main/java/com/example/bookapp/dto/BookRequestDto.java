package com.example.bookapp.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookRequestDto {

    @NotBlank(message = "タイトルを入れてください。")
    @Size(max = 100)
    private String bookTitle;

    @NotBlank(message = "著者名を入れてください。")
    @Size(max = 100)
    private String authorName;

    @Min(value = 0, message = "巻数は0以上で入力してください")
    @Max(value = 999, message = "巻数は999以下で入力してください")
    private Integer bookVolume;

    @Size(max = 255, message = "画像ファイル名は255文字以内で入力してください")
    private String coverImage;


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
