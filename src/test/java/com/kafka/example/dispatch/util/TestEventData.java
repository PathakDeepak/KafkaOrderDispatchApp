package com.kafka.example.dispatch.util;

import com.kafka.example.dispatch.message.OrderCreated;

import java.util.UUID;

public class TestEventData {

    public static OrderCreated buildOrderCreatedEvent(UUID id, String item) {
        return OrderCreated.builder()
                .orderId(id)
                .item(item)
                .build();
    }
}
