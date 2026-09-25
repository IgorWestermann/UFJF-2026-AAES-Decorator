package org.example;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new CaramelDecorator(coffee, 1);
        coffee = new MilkDecorator(coffee, "almond");
        coffee = new ChocolateDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println(coffee.description());
        System.out.println("Total cost: $" + coffee.cost());
    }
}
