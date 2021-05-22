package am.aua.model.pastry.decorators.basic_pastry;

import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.decorators.DecoratorGroup;
import am.aua.model.pastry.decorators.DecoratorType;
import com.sun.jdi.InvalidTypeException;

public abstract class Decorator {
    protected Decorator base;

    public Decorator(Decorator base) {
        this.base = base;
    }

    public Pastry build() {
        Pastry pastry = base != null ? base.build() : createPlainPastry();

        switch (getGroup()) {
            case TOPPING -> pastry.addTopping(getType());
            case STUFFING -> pastry.addStuffing(getType());
        }

        return pastry;
    }

    public Pastry createPlainPastry() {
        throw new IllegalStateException();
    };

    public abstract String getDescription();

    public abstract double getPrice();

    public abstract DecoratorGroup getGroup();

    public abstract DecoratorType getType();
}
