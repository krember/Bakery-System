package am.aua.model.pastry.decorators.basic_pastry;

import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.DecoratorType;

public class PlainCroissant extends Decorator {

    public PlainCroissant(Decorator base) {
        super(base);
        if (base != null) {
            throw new IllegalArgumentException("Plain pastry cannot decorate anything");
        }
    }

    @Override
    public String getDescription() {
        return "Plain Croissant";
    }

    @Override
    public double getPrice() {
        return 1.2;
    }

    @Override
    public DecoratorGroup getGroup() {
        return DecoratorGroup.PLAIN_PASTRY;
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.PLAIN_CROISSANT;
    }
}
