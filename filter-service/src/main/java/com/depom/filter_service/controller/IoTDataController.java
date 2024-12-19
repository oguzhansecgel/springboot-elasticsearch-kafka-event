package com.depom.filter_service.controller;

import com.depom.filter_service.model.IoTDocument;
import com.depom.filter_service.service.IoTDataFilterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class IoTDataController {

    private final IoTDataFilterService service;

    public IoTDataController(IoTDataFilterService service) {
        this.service = service;
    }
    @GetMapping("/getall/IoTData")
    public Iterable<IoTDocument> getAllIoTData()
    {
        return service.getAllIoTDataFilters();
    }
}
