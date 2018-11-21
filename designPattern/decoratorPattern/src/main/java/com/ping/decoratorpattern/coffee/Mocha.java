package com.ping.decoratorpattern.coffee;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        System.out.println("price : "+0.2+ beverage.cost());
        return .20 + beverage.cost();
    }

}
