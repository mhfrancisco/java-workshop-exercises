package com.gamesys.workshop;

public class Operators {
    public static void main(String[] args) {
        double radius = 2.5;
        double circumference = 2.0 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2.0);
        System.out.println("A circle's circumference with a radius of "
                + radius + " is " + circumference + " it's area is " + area);

        double celsius = 100;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        double kelvin = celsius + 273.14;
        System.out.println(celsius + "°C = " + fahrenheit + "°F = " + kelvin + "K");
    }
}
