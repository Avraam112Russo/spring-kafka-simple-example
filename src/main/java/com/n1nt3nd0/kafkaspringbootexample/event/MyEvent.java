package com.n1nt3nd0.kafkaspringbootexample.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyEvent {
    private int id;
    private String message;
}
