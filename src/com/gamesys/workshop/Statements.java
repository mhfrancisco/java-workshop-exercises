package com.gamesys.workshop;

public class Statements {
    public static void main(String[] args) {
        int limit = 100;
        int height = 50;
        int width = 50;
        int rectanglePerimeter = 2 * (height + width);

        if (rectanglePerimeter > limit) {
            System.out.println("The perimeter for height " + height + " and width " + width + " is greater than " + limit);
        }
    }
}