package com.tdd.observer;

public class CurrentConditionsDisplay implements Observer
{

    private double temperature;
    private double humidity;

    Subject        weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void update(double temperature, double humidity, double pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        Display();

    }

    private void Display()
    {
        System.out.println("Current Conditions: " + temperature + " degrees and" + humidity + " humidity");
    }

}
