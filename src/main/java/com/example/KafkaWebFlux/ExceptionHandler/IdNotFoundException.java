package com.example.KafkaWebFlux.ExceptionHandler;

public class IdNotFoundException extends RuntimeException {

    private final Integer id;

    public IdNotFoundException(Integer id) {
        super("Id not found: " + id);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
