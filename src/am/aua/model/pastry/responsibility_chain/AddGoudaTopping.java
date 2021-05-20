package am.aua.model.pastry.responsibility_chain;

import am.aua.model.pastry.decorators.basic_pastry.Decorator;
import am.aua.model.pastry.decorators.toppings.GoudaTopping;

public class AddGoudaTopping extends Action {
    @Override
    public GoudaTopping run(Decorator previous) {
        if (previous == null) {
            // TODO: throw an exception
            return null;
        }
        return new GoudaTopping(previous);
    }
}
