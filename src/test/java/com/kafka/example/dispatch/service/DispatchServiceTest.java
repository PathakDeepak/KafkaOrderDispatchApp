package com.kafka.example.dispatch.service;

import com.kafka.example.dispatch.message.OrderCreated;
import com.kafka.example.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.UUID.randomUUID;

public class DispatchServiceTest {

    private DispatchService service;

    @BeforeEach
    void setup() {
        service = new DispatchService();
    }

    @Test
    void process() {
        OrderCreated testEvent = TestEventData.buildOrderCreatedEvent(randomUUID(), randomUUID().toString());
        service.process(testEvent);
    }
}
