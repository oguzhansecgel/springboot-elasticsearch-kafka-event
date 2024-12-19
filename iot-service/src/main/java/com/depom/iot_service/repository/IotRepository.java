package com.depom.iot_service.repository;

import com.depom.iot_service.entity.Iot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface IotRepository extends JpaRepository<Iot, Integer> {
    void deleteByTimestampBefore(LocalDateTime date);
}
