package structural_patterns.decorator.coffee_shop;

public abstract class CoffeeDecorator implements Beverage {
    protected Beverage beverage;

    public CoffeeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
