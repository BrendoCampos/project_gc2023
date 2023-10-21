package com.project_gc2023;

public class App {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        App converter = new App();

        double fahrenheit = 32.0;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");

        double celsius2 = 100.0;
        double fahrenheit2 = converter.celsiusToFahrenheit(celsius2);
        System.out.println(celsius2 + " Celsius = " + fahrenheit2 + " Fahrenheit");
    
}
