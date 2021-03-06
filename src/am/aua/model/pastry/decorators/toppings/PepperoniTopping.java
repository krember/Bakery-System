package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public class PepperoniTopping extends Topping{
    public PepperoniTopping(DecoratorBuilder base) {
        super(base);
    }
    @Override
    public String getDescription() {
        return "Pepperoni + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 2 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.PEPPERONI;
    }
}
