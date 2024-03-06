package com.example.samplestsproduct.exception;

public class ProductNotfoundException extends RuntimeException{
    public ProductNotfoundException(String message) {
        super(message);
    }

    public ProductNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
