package am.aua.model.pastry.decorators.stuffing;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public class VanillaCreamStuffing extends Stuffing {

    public VanillaCreamStuffing(DecoratorBuilder base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Vanilla cream stuffing + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 0.75 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.VANILLA_CREAM;
    }
}
