package org.example;

public class BasicCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}
