package com.depom.filter_service.repository;

import com.depom.filter_service.model.IoTDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

public interface IoTDataElasticSearchRepository extends ElasticsearchRepository<IoTDocument, Integer> {
}
