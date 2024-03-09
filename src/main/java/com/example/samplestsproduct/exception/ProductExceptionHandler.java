package com.example.samplestsproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(value ={ProductNotfoundException.class})
    public ResponseEntity<Object> handleProductNotFoundException
            (ProductNotfoundException pne) {
       return ResponseEntity.status(HttpStatusCode.valueOf(404)).body(new ErrorMessage("-1", pne.getMessage()));
    }
    
    
    class ErrorMessage {
    	private String erroCode;
    	private String message;
    	public ErrorMessage(String errorCode, String message) {
    		this.erroCode = errorCode;
    		this.message = message;
    	}
    }
}
