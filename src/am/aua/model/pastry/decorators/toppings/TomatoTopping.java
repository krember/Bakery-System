package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public class TomatoTopping extends Topping{
    public TomatoTopping(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Tomato sauce + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return .5 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.TOMATO;
    }
}
