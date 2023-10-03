package com.example.KafkaWebFlux.Config;

import com.example.KafkaWebFlux.ExceptionHandler.ReactiveExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReactiveWebExceptionHandlerConfig {

    @Bean
    public ReactiveExceptionHandler reactiveExceptionHandler() {
        return new ReactiveExceptionHandler();
    }
}
