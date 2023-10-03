package com.example.KafkaWebFlux.Repository;

import com.example.KafkaWebFlux.Entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MessageRepository {

    private final ReactiveMongoTemplate reactiveMongoTemplate;

    @Autowired
    public MessageRepository(ReactiveMongoTemplate reactiveMongoTemplate) {
        this.reactiveMongoTemplate = reactiveMongoTemplate;
    }

    public Mono<Message> findById(Integer id) {
        return reactiveMongoTemplate.findById(id, Message.class);
    }

    public Mono<Message> save(Message message) {
        return reactiveMongoTemplate.save(message);
    }
}
