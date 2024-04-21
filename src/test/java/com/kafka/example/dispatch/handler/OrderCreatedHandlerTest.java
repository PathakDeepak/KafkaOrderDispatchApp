package com.kafka.example.dispatch.handler;

import com.kafka.example.dispatch.service.DispatchService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void lister() {
        handler.listen("payload");
        verify(serviceMock, times(1)).process("payload");
    }
}
