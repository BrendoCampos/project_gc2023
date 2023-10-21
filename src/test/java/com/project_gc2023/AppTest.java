package com.project_gc2023;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest {
    @Test
    public void testFahrenheitToCelsius() {
        App converter = new App();
        double result = converter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsiusNegative() {
        App converter = new App();
        double result = converter.fahrenheitToCelsius(-40.0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsiusPositive() {
        App converter = new App();
        double result = converter.fahrenheitToCelsius(212.0);
        assertEquals(0.0, result, 0.001);
    }
}
