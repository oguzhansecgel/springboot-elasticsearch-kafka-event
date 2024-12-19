package com.depom.notification_service.consumer;

import com.depom.notification_service.model.IotData;
import com.depom.notification_service.service.IotDataInfoMailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IotDataConsumer {

    private final IotDataInfoMailService iotData;

    public IotDataConsumer(IotDataInfoMailService iotData) {
        this.iotData = iotData;
    }


    @KafkaListener(topics = "${spring.kafka.template.default-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void createConsumer(ConsumerRecord<String, IotData> payload) {
        iotData.dangerTempareture(payload.value());
        System.out.println("Consumer tarafından mesaj alındı  : " + payload.value() + " : ");
    }
}
