package com.gamesys.workshop;

class Main {
    public static void main(String[] args) {
        Employee juan = new Employee("Juan", "Mercado", "dela Cruz", 23);
        System.out.println("My name is " + juan.getFirstName() + " " + juan.getMiddleName() + " " + juan.getLastName() + " and I am " + juan.getAge() + " years old.");
        System.out.println("I was born on the year " + getBirthYear(juan.getAge()));

        // getFullName method without middleName
        System.out.println("My full name is " + getFullName(juan.getFirstName(), juan.getLastName()));

        // getFullName method with middleName
        System.out.println("My full name is " + getFullName(juan.getFirstName(), juan.getMiddleName(), juan.getLastName()));
    }

    private static int getBirthYear(int age) {
        int currentYear = 2020;
        return currentYear - age;
    }

    private static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static String getFullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }

}

class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
}