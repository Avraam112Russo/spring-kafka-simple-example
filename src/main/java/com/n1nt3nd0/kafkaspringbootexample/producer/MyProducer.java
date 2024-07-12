package com.n1nt3nd0.kafkaspringbootexample.producer;


import com.n1nt3nd0.kafkaspringbootexample.event.MyEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class MyProducer {
    public static final String TOPIC = "some-topic-name";
    private final KafkaTemplate<String, MyEvent> kafkaTemplate;
    public void sendFlightEvent(MyEvent event){
        String key = String.valueOf(event.getId());
        kafkaTemplate.send(TOPIC, key , event);
        log.info("Producer produced the message {}", event);
        // write your handlers and post-processing logic, based on your use case
    }
}
