package com.n1nt3nd0.kafkaspringbootexample.http.Rest;

import com.n1nt3nd0.kafkaspringbootexample.event.MyEvent;
import com.n1nt3nd0.kafkaspringbootexample.producer.MyProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MyRestController {
    private final MyProducer producer;
    @GetMapping("/event")
    public ResponseEntity<?> getEvent(@RequestParam int id, @RequestParam String message) {
        producer.sendFlightEvent(
                MyEvent.builder()
                        .id(id)
                        .message(message)
                        .build()
        );
        return ResponseEntity.ok("Success.");
    }
}
