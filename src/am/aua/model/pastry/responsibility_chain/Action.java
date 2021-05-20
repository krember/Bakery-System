package am.aua.model.pastry.responsibility_chain;

import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public abstract class Action {
    public abstract Decorator run(Decorator previous);
}
