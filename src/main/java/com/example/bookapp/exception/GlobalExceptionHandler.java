package com.example.bookapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

//例外処理発生時実行
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidException(MethodArgumentNotValidException validException) {

        //API表示（複数項目）
        List<String> messages = new ArrayList<>();
        List<FieldError> errors = validException.getBindingResult().getFieldErrors();
        for (FieldError error : errors){
            messages.add(error.getDefaultMessage());
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("messages", messages));
    }


    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<?> bookNotException(BookNotFoundException notException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("messages", List.of(notException.getMessage())));
    }

}


