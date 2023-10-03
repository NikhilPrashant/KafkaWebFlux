package com.example.KafkaWebFlux.Service;

import com.example.KafkaWebFlux.Entities.Message;
import com.example.KafkaWebFlux.ExceptionHandler.IdNotFoundException;
import com.example.KafkaWebFlux.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Mono<Message> findById(Integer id) {
        Mono<Message> messageMono = messageRepository.findById(id);
        if (messageMono.toString().isBlank())
            throw new IdNotFoundException(id);
        System.out.println(2);
        return messageMono;
    }

    public Mono<Message> save(Message message) {
        Mono<Message> messageMono = messageRepository.save(message);
        System.out.println(1);
        return messageMono;
    }
}
