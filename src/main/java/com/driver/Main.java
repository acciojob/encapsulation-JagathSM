package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly("Yin");

        // Task 4 :
        // obj.name; // Compile Error: not a statement
        // Not able to access name variable as it's private

        // Task 6:
        obj.setName("Yang");

        System.out.println(obj.getName()); // Yang

    }
}