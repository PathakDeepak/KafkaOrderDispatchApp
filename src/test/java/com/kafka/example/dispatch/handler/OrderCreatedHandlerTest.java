package com.kafka.example.dispatch.handler;

import com.kafka.example.dispatch.message.OrderCreated;
import com.kafka.example.dispatch.service.DispatchService;
import com.kafka.example.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static java.util.UUID.randomUUID;
import static org.mockito.Mockito.*;

public class OrderCreatedHandlerTest {

    private OrderCreatedHandler handler;
    private DispatchService serviceMock;

    @BeforeEach
    void setup() {
        serviceMock = mock(DispatchService.class);
        handler = new OrderCreatedHandler(serviceMock);
    }

    @Test
    void listen() {
        OrderCreated testEvent = TestEventData.buildOrderCreatedEvent(randomUUID(), randomUUID().toString());
        handler.listen(testEvent);
        verify(serviceMock, times(1)).process(testEvent);
    }
}
