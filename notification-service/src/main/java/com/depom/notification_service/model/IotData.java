package com.depom.notification_service.model;

import java.time.LocalDateTime;

public class IotData {
    private int id;

    private Double temperature;
    private LocalDateTime timestamp;

    public IotData(int id, Double temperature, LocalDateTime timestamp) {
        this.id = id;
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    public IotData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "IotData{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", timestamp=" + timestamp +
                '}';
    }
}
