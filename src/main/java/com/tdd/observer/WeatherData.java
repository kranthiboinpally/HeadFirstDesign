package com.tdd.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{

    double         temperature;
    double         humidity;
    double         pressure;
    List<Observer> observers;

    public WeatherData()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer)
    {

        if (observers.contains(observer))
        {
            observers.remove(observer);
        }
        else
        {
            System.out.println("you are already removed");
        }

    }

    @Override
    public void notifyObserver()
    {
        observers.forEach(x -> x.update(temperature, humidity, pressure));
    }

    public void setMeasurements(double temperature, double humidity, double pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged()
    {
        notifyObserver();

    }
}
