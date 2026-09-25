package org.example;

public class ChocolateDecorator extends CoffeeDecorator {
    private static final double PRICE = 1.25;

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + PRICE;
    }

    @Override
    public String description() {
        return super.description() + ", with chocolate";
    }
}
