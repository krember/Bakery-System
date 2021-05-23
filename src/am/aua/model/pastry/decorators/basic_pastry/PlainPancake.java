package am.aua.model.pastry.decorators.basic_pastry;

import am.aua.model.pastry.Pancake;
import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.DecoratorType;

public class PlainPancake extends Decorator {

    public PlainPancake(Decorator base) {
        super(base);
    }

    @Override
    public Pastry createPlainPastry() {
        return new Pancake();
    }

    @Override
    public String getDescription() {
        return "Plain Pancake";
    }

    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public DecoratorGroup getGroup() {
        return DecoratorGroup.PLAIN_PASTRY;
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.PLAIN_PANCAKE;
    }
}
