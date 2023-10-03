package com.example.KafkaWebFlux.Entities;

import lombok.Data;

@Data
public class Error {

    String code;
    String message;
}
