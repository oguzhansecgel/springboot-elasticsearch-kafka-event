package com.depom.iot_service.dto.request;



import java.time.LocalDateTime;


public class CreateIotDataRequest {
    private Double temperature;
    private LocalDateTime timestamp;

    public CreateIotDataRequest(Double temperature, LocalDateTime timestamp) {
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    public CreateIotDataRequest() {
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
