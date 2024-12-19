package com.depom.notification_service.service;

import com.depom.notification_service.model.IotData;
import org.springframework.stereotype.Service;

@Service
public class IotDataInfoMailService
{
    private Double temprature = 20.0;
    public IotDataInfoMailService() {
    }

    public void dangerTempareture(IotData iotData)
    {
        if(temprature< iotData.getTemperature())
        {
            System.out.println("Beklenenden Daha Yüksek Bir Sıcaklık Girişi Oldu...!");

        }
        else
            System.out.println("beklenen sıcaklık değeri devam ediyor..");
    }
}
