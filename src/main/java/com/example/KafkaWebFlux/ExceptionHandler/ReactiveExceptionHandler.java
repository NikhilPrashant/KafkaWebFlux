package com.example.KafkaWebFlux.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class ReactiveExceptionHandler implements ReactiveWebExceptionHandler {

    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        if (ex instanceof IdNotFoundException) {
            exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
            return Mono.fromRunnable(() -> {
                System.out.println("ERROR");
            });
        } else {
            return Mono.error(ex);
        }
    }
}

