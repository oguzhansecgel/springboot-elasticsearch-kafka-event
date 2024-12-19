package com.depom.iot_service.kafka;

import com.depom.iot_service.dto.response.CreateIotDataResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {
    private final KafkaTemplate<String, CreateIotDataResponse> kafkaTemplate;

    public NotificationProducer(KafkaTemplate<String, CreateIotDataResponse> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Value("${spring.kafka.template.default-topic}")
    private String defaultTopic;

    public void sendMessage(CreateIotDataResponse message) {
        System.out.println("Notification Service mesaj iletildi ! Sıcaklık "+ message.getTemperature()+" Tarih ve Zaman : " + message.getTimestamp());
        kafkaTemplate.send(defaultTopic, message);

    }
}
