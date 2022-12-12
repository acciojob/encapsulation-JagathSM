package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        // Task 4 :
        // obj.name = "Jagath";
        // Compile Error: name has private access in com.driver.RWOnly

        // Task 6:
        obj.setName("Jagath");

        System.out.println(obj.getName()); // Yang

    }
}