package com.depom.filter_service.service;

import com.depom.filter_service.model.IoTDocument;

public interface IoTDataFilterService {

    void createIoTDataFilter(IoTDocument ioTDocument);
    Iterable<IoTDocument> getAllIoTDataFilters();
}
