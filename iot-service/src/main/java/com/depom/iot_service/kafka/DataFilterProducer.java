package com.depom.iot_service.kafka;

import com.depom.iot_service.dto.response.CreateIotDataResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class DataFilterProducer {
    private final KafkaTemplate<String, CreateIotDataResponse> kafkaTemplate;

    @Value("${spring.kafka.template.default-filter-topic}")
    private String defaultTopic;

    public DataFilterProducer(KafkaTemplate<String, CreateIotDataResponse> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(CreateIotDataResponse message) {
        System.out.println("Data filter mesaj iletildi! Sıcaklık: {}, Tarih ve Zaman: {}");
        kafkaTemplate.send(defaultTopic, message);
    }
}