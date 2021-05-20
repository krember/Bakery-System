package am.aua.model.pastry.builders;

import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.Pizza;

public class PizzaBuilder extends Builder {
    @Override
    public Pizza build() {
        return new Pizza();
    }
}
