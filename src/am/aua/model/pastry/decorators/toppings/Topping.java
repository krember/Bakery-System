package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public abstract class Topping extends Decorator {
    public Topping(Decorator base) {
        super(base);
    }
}