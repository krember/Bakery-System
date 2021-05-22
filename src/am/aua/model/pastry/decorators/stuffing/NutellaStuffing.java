package am.aua.model.pastry.decorators.stuffing;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public class NutellaStuffing extends Stuffing {

    public NutellaStuffing(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Nutella stuffing + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 1.6 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.NUTELLA;
    }
}
