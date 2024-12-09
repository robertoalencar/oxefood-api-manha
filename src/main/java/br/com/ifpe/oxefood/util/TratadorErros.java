package br.com.ifpe.oxefood.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorErros {

    @ExceptionHandler(Exception.class)
    public ResponseEntity tratarErro500(Exception ex) {

        return ResponseEntity.internalServerError().body(ex.getMessage());
    }

}