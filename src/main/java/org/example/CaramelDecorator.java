package org.example;

public class CaramelDecorator extends CoffeeDecorator {
    private final int caramelDashes;

    public CaramelDecorator(Coffee coffee, int caramelDashes) {
        super(coffee);
        if (caramelDashes < 0) {
            throw new IllegalArgumentException("caramelDashes must not be negative");
        }
        this.caramelDashes = caramelDashes;
    }

    @Override
    public double cost() {
        return super.cost() + (0.5 * caramelDashes);
    }

    @Override
    public String description() {
        return super.description() + ", with " + caramelDashes + " dash(s) of caramel";
    }
}
