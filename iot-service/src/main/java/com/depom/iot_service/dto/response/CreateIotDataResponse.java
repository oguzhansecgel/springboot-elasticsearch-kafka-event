package com.depom.iot_service.dto.response;



import java.time.LocalDateTime;



public class CreateIotDataResponse {
    private int id;
    private Double temperature;
    private LocalDateTime timestamp;

    public CreateIotDataResponse(int id, Double temperature, LocalDateTime timestamp) {
        this.id = id;
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    public CreateIotDataResponse() {
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
}
