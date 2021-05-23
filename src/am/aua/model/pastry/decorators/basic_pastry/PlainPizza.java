package am.aua.model.pastry.decorators.basic_pastry;

import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.Pizza;
import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.DecoratorType;

public class PlainPizza extends DecoratorBuilder {
    public PlainPizza(DecoratorBuilder base) {
        super(base);
        if (base != null) {
            throw new IllegalArgumentException("Plain pastry cannot decorate anything");
        }
    }

    @Override
    public Pastry createPlainPastry() {
        return new Pizza();
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public DecoratorGroup getGroup() {
        return DecoratorGroup.PLAIN_PASTRY;
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.PLAIN_PIZZA;
    }
}
