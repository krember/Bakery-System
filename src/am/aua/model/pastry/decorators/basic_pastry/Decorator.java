package am.aua.model.pastry.decorators.basic_pastry;

import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.DecoratorType;

public abstract class Decorator {
    protected Decorator base;

    public Decorator(Decorator base) {
        this.base = base;
    }

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract DecoratorGroup getGroup();

    public abstract DecoratorType getType();
}
