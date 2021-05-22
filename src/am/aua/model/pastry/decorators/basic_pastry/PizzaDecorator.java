package am.aua.model.pastry.decorators.basic_pastry;

import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.DecoratorType;

public class PizzaDecorator extends Decorator {
    public PizzaDecorator(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public DecoratorGroup getGroup() {
        return null;
    }

    @Override
    public DecoratorType getType() {
        return null;
    }
}
