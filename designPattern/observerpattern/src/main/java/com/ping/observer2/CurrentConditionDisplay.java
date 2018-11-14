package com.ping.observer2;

import com.ping.observer1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 23:54 2018/11/14
 * @Modified By:
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degress and " +
                humidity + " % humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
