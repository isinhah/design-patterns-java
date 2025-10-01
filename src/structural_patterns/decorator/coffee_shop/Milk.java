package structural_patterns.decorator.coffee_shop;

public class Milk extends CoffeeDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 1.0;
    }
}
