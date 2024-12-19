package com.depom.filter_service.service.impl;

import com.depom.filter_service.model.IoTDocument;
import com.depom.filter_service.repository.IoTDataElasticSearchRepository;
import com.depom.filter_service.service.IoTDataFilterService;
import org.springframework.stereotype.Service;

@Service
public class IoTDataFilterServiceImpl implements IoTDataFilterService {


    private final IoTDataElasticSearchRepository repository;

    public IoTDataFilterServiceImpl(IoTDataElasticSearchRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createIoTDataFilter(IoTDocument ioTDocument) {
        repository.save(ioTDocument);
    }

    @Override
    public Iterable<IoTDocument> getAllIoTDataFilters() {
        return repository.findAll();
    }
}
