package structural_patterns.decorator.coffee_shop;

// Decorador concreto que adiciona chocolate (complemento) a uma bebida.
// Modificando o valor dos atributos sem alterar a classe original.
public class Chocolate extends CoffeeDecorator {

    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 3.0;
    }
}
