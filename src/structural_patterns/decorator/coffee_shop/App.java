package structural_patterns.decorator.coffee_shop;

public class App {
    public static void main(String[] args) {
        Beverage coffee = new SimpleCoffee();
        System.out.println("Coffee: " + coffee.getDescription() + "\nR$ " + coffee.getPrice());

        Beverage coffeeWithMilk = new Milk(coffee);
        System.out.println("Coffee with milk: " + coffeeWithMilk.getDescription() + "\nR$ " + coffeeWithMilk.getPrice());

        Beverage coffeeWithChocolate = new Chocolate(coffee);
        System.out.println("Coffee with chocolate: " + coffeeWithChocolate.getDescription() + "\nR$ " + coffeeWithChocolate.getPrice());
    }
}
