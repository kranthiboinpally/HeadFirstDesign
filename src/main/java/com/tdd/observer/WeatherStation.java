package com.tdd.observer;

public class WeatherStation
{

    public static void main(String[] args)
    {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(20, 50, 500);
        System.out.println("kranthi");

    }

}
