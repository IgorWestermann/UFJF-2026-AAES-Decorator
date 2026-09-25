package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeDecoratorTest {

    @Test
    void shouldReturnBasicCoffeeCostAndDescription() {
        Coffee coffee = new BasicCoffee();

        assertEquals(5.0, coffee.cost());
        assertEquals("Basic Coffee", coffee.description());
    }

    @Test
    void shouldAddCaramelBehavior() {
        Coffee coffee = new CaramelDecorator(new BasicCoffee(), 2);

        assertEquals(6.0, coffee.cost());
        assertEquals("Basic Coffee, with 2 dash(s) of caramel", coffee.description());
    }

    @Test
    void shouldAddMilkBehavior() {
        Coffee coffee = new MilkDecorator(new BasicCoffee(), "almond");

        assertEquals(7.0, coffee.cost());
        assertEquals("Basic Coffee, with almond milk", coffee.description());
    }

    @Test
    void shouldAddChocolateBehavior() {
        Coffee coffee = new ChocolateDecorator(new BasicCoffee());

        assertEquals(6.25, coffee.cost());
        assertEquals("Basic Coffee, with chocolate", coffee.description());
    }

    @Test
    void shouldAddWhippedCreamBehavior() {
        Coffee coffee = new WhippedCreamDecorator(new BasicCoffee());

        assertEquals(5.75, coffee.cost());
        assertEquals("Basic Coffee, with whipped cream", coffee.description());
    }

    @Test
    void shouldComposeMultipleDecorators() {
        Coffee coffee = new BasicCoffee();
        coffee = new CaramelDecorator(coffee, 1);
        coffee = new MilkDecorator(coffee, "almond");
        coffee = new ChocolateDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        assertEquals(9.5, coffee.cost());
        assertEquals(
                "Basic Coffee, with 1 dash(s) of caramel, with almond milk, with chocolate, with whipped cream",
                coffee.description()
        );
    }

    @Test
    void shouldSupportDifferentDecoratorOrder() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee, "oat");
        coffee = new CaramelDecorator(coffee, 2);

        assertEquals(7.75, coffee.cost());
        assertEquals(
                "Basic Coffee, with oat milk, with 2 dash(s) of caramel",
                coffee.description()
        );
    }
}
