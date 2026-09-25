package org.example;

import java.util.Locale;
import java.util.Objects;

public class MilkDecorator extends CoffeeDecorator {
    private final String milkType;

    public MilkDecorator(Coffee coffee, String milkType) {
        super(coffee);
        this.milkType = Objects.requireNonNull(milkType, "milkType must not be null");
    }

    @Override
    public double cost() {
        if ("almond".equalsIgnoreCase(milkType)) {
            return super.cost() + 2.0;
        } else if ("oat".equalsIgnoreCase(milkType)) {
            return super.cost() + 1.75;
        }
        return super.cost() + 1.5;
    }

    @Override
    public String description() {
        return super.description() + ", with " + milkType.toLowerCase(Locale.ROOT) + " milk";
    }
}
