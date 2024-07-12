package com.n1nt3nd0.kafkaspringbootexample.consumer;

import com.n1nt3nd0.kafkaspringbootexample.event.MyEvent;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "some-topic-name", groupId = "some-group-id ")
    public void flightEventConsumer(MyEvent message) {
        log.info("Consumer consume Kafka message -> {}", message);

        // write your handlers and post-processing logic, based on your use case
    }

//    @Data
//    class MyEvent {
//        private String key;
//        // other variables state, based on your use case
//    }
}
