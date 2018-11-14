package com.ping.observer2;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 23:50 2018/11/14
 * @Modified By:
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
