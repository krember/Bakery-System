package am.aua.model.pastry.decorators.toppings;

import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;

public class MozzarellaTopping extends Topping {
    public MozzarellaTopping(Decorator base) {
        super(base);
    }

    @Override
    public String getDescription() {
        return "Mozzarella cheese + " + base.getDescription();
    }

    @Override
    public double getPrice() {
        return 1 + base.getPrice();
    }

    @Override
    public DecoratorType getType() {
        return DecoratorType.MOZZARELLA;
    }
}
