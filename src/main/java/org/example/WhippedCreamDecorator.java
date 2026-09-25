package org.example;

public class WhippedCreamDecorator extends CoffeeDecorator {
    private static final double PRICE = 0.75;

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + PRICE;
    }

    @Override
    public String description() {
        return super.description() + ", with whipped cream";
    }
}
