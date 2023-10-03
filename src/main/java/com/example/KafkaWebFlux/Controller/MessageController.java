package com.example.KafkaWebFlux.Controller;

import com.example.KafkaWebFlux.Entities.Message;
import com.example.KafkaWebFlux.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/{id}")
    public Mono<Message> getMessageById(@PathVariable Integer id) {
        return messageService.findById(id);
    }

    @PostMapping
    public Mono<Message> createMessage(@RequestBody Message message) {
        return messageService.save(message);
    }
}
