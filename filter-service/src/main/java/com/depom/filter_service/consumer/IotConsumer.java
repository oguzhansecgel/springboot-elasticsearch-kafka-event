package com.depom.filter_service.consumer;

import com.depom.filter_service.model.IoTDocument;
import com.depom.filter_service.service.IoTDataFilterService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class IotConsumer {

    private final IoTDataFilterService service;

    public IotConsumer(IoTDataFilterService service) {
        this.service = service;
    }
    @KafkaListener(topics = "${spring.kafka.template.default-filter-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void createConsumer(ConsumerRecord<String, IoTDocument> payload) {
        service.createIoTDataFilter(payload.value());
        System.out.println("Consumer tarafından mesaj alındı  : " + payload.value());
    }
}
