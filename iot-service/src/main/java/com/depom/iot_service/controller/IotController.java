package com.depom.iot_service.controller;

import com.depom.iot_service.dto.request.CreateIotDataRequest;
import com.depom.iot_service.dto.response.CreateIotDataResponse;
import com.depom.iot_service.entity.Iot;
import com.depom.iot_service.service.IotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/iot/data")
public class IotController {
    private final IotService iotService;

    public IotController(IotService iotService) {
        this.iotService = iotService;
    }

    @GetMapping("/getAll/iotData")
    public List<Iot> getAllIotData()
    {
        return iotService.getAllItoResponse();
    }
    @PostMapping("/create/iot/data")
    public CreateIotDataResponse createIotData(@RequestBody CreateIotDataRequest request)
    {
        return iotService.createIotData(request);
    }
}
