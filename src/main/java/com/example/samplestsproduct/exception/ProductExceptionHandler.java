package com.example.samplestsproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(value ={ProductNotfoundException.class})
    public ResponseEntity<Object> handleProductNotFoundException
            (ProductNotfoundException productNotFoundException) {

        ProductException productException =new ProductException(
                productNotFoundException.getMessage(),
                productNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
       return new ResponseEntity<>(productException, HttpStatus.NOT_FOUND);
    }
}
