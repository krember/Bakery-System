package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public class TomatoTopping extends Topping{
    public TomatoTopping(DecoratorBuilder base) {
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
