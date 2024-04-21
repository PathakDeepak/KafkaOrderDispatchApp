package com.kafka.example.dispatch.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispatchServiceTest {

    private DispatchService service;

    @BeforeEach
    void setup() {
        service = new DispatchService();
    }

    @Test
    void process() {
        service.process("payload");
    }
}
