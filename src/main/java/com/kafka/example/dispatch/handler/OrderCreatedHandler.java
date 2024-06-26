package com.kafka.example.dispatch.handler;

import com.kafka.example.dispatch.service.DispatchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderCreatedHandler {
    private final DispatchService dispatchService;

    //Added a consumer with @KafkaListener
    @KafkaListener(
            id = "OrderConsumerClient",
            topics = "order.created",
            groupId = "dispatch.order.created.consumer"
    )
    public void listen(String payload) {
        log.info("Received Message: payload: " + payload);
        dispatchService.process(payload);
    }
}
