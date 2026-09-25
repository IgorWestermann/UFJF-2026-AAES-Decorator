package org.example;

import java.util.Objects;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = Objects.requireNonNull(coffee, "coffee must not be null");
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String description() {
        return coffee.description();
    }
}
