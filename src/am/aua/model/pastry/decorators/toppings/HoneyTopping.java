package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public class HoneyTopping extends Topping {
    public HoneyTopping(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Honey + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 2 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.HONEY;
    }
}
