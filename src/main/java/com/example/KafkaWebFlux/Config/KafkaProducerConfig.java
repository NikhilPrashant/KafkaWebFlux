//package com.example.KafkaWebFlux.Config;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class KafkaProducerConfig {
//    private final String bootstrapServers = "your-kafka-broker-url"; // Update with your Kafka broker URL
//
//    @Bean
//    public ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate() {
//        Map<String, Object> producerProps = new HashMap<>();
//        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//        // Add other producer properties here
//
//        return new ReactiveKafkaProducerTemplate<>(producerProps);
//    }
//}
