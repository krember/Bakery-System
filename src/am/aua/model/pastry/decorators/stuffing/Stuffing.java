package am.aua.model.pastry.decorators.stuffing;

import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;

public abstract class Stuffing extends DecoratorBuilder {
    public Stuffing(DecoratorBuilder base) {
        super(base);
    }

    @Override
    public DecoratorGroup getGroup() {
        return DecoratorGroup.STUFFING;
    }
}
