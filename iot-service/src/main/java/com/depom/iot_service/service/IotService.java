package com.depom.iot_service.service;

import com.depom.iot_service.dto.request.CreateIotDataRequest;
import com.depom.iot_service.dto.response.CreateIotDataResponse;
import com.depom.iot_service.entity.Iot;

import java.util.List;

public interface IotService
{
    CreateIotDataResponse createIotData(CreateIotDataRequest request);
    List<Iot> getAllItoResponse();

}
