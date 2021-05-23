package am.aua.model.pastry.decorators.stuffing;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public class CheeseCrustStuffing extends Stuffing{
    public CheeseCrustStuffing(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Cheese crust + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 2 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.CHEESE_CRUST;
    }
}
