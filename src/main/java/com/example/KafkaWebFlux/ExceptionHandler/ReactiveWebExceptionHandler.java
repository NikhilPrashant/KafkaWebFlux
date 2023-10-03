package com.example.KafkaWebFlux.ExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

@RestControllerAdvice
public interface ReactiveWebExceptionHandler extends WebExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    @Override
    Mono<Void> handle(ServerWebExchange exchange, Throwable ex);
}
