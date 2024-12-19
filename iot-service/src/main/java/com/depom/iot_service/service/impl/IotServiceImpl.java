package com.depom.iot_service.service.impl;

import com.depom.iot_service.dto.request.CreateIotDataRequest;
import com.depom.iot_service.dto.response.CreateIotDataResponse;
import com.depom.iot_service.entity.Iot;
import com.depom.iot_service.kafka.DataFilterProducer;
import com.depom.iot_service.kafka.NotificationProducer;
import com.depom.iot_service.repository.IotRepository;
import com.depom.iot_service.service.IotService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class IotServiceImpl implements IotService {

    private final IotRepository iotRepository;
    private final NotificationProducer notificationProducer;
    private final DataFilterProducer dataFilterProducer;

    public IotServiceImpl(IotRepository iotRepository, NotificationProducer notificationProducer, DataFilterProducer dataFilterProducer) {
        this.iotRepository = iotRepository;
        this.notificationProducer = notificationProducer;
        this.dataFilterProducer = dataFilterProducer;
    }

    @Override
    public CreateIotDataResponse createIotData(CreateIotDataRequest request) {
        Iot iot = new Iot();
        iot.setTimestamp(request.getTimestamp());
        iot.setTemperature(request.getTemperature());
        Iot savedIot = iotRepository.save(iot);
        notificationProducer.sendMessage(new CreateIotDataResponse(savedIot.getId(),savedIot.getTemperature(),savedIot.getTimestamp()));
        dataFilterProducer.sendMessage(new CreateIotDataResponse(savedIot.getId(),savedIot.getTemperature(),savedIot.getTimestamp()));
        return new CreateIotDataResponse(savedIot.getId(),savedIot.getTemperature(),savedIot.getTimestamp());

    }

    @Override
    public List<Iot> getAllItoResponse() {
        return iotRepository.findAll();
    }


}
