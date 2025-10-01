package structural_patterns.decorator.coffee_shop;

public class SimpleCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
