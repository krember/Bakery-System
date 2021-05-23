package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public class StrawberryTopping extends Topping {

    public StrawberryTopping(DecoratorBuilder base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Strawberry + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 1.8 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.STRAWBERRY;
    }
}
