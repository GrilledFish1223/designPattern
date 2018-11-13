package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:20 2018/11/14
 * @Modified By:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeaturements(80,65,30.4f);
    }
}
