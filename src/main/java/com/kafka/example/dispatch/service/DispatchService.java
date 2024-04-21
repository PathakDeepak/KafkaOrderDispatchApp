package com.kafka.example.dispatch.service;

import com.kafka.example.dispatch.message.OrderCreated;
import org.springframework.stereotype.Service;

@Service
public class DispatchService {

    public void process(OrderCreated payload) {
        //no-op
    }
}
