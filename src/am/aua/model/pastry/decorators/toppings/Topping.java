package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public abstract class Topping extends DecoratorBuilder {
    public Topping(DecoratorBuilder base) {
        super(base);
    }

    @Override
    public DecoratorGroup getGroup() {
        return DecoratorGroup.TOPPING;
    }
}
