package com.gamesys.workshop;

public class ControlFlow {
    public static void main(String[] args) {
        String[] names = {"Oscar", "Wilfred", "Adam", "Bethany", "Sam"};
        String temp;

        for(int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i <= names.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(names[i] + " ");
            }
        }
    }
}
