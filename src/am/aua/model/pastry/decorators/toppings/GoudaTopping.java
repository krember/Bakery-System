package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public class GoudaTopping extends Topping {
    public GoudaTopping(DecoratorBuilder base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Gouda cheese + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 1 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.GOUDA;
    }
}
