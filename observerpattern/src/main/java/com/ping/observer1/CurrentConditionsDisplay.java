package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:14 2018/11/14
 * @Modified By:
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degress and " +
                humidity + " % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void updateWechat(String message) {

    }
}
