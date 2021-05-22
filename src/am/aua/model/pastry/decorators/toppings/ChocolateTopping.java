package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public class ChocolateTopping extends Topping {
    public ChocolateTopping(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Chocolate topping + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 0.8 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.CHOCOLATE;
    }
}
