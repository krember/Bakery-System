package am.aua.model.pastry.responsibility_chain;

import am.aua.model.pastry.decorators.basic_pastry.Decorator;
import am.aua.model.pastry.decorators.basic_pastry.PizzaDecorator;

public class BakePizza extends Action{

    @Override
    public PizzaDecorator run(Decorator previous) {
        if (previous != null) {
            // TODO: throw an exception
            return null;
        }
        return new PizzaDecorator(null);
    }
}
