package am.aua.model.pastry.decorators.stuffing;

import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public abstract class Stuffing extends Decorator {
    public Stuffing(Decorator base) {
        super(base);
    }
}
