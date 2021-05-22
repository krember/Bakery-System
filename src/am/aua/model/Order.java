package am.aua.model;

import am.aua.model.pastry.decorators.DecoratorType;

import java.util.ArrayList;
import java.util.List;

public class Order {
    DecoratorType pastry;
    private final List<DecoratorType> toppings;
    private final List<DecoratorType> stuffings;

    public Order(DecoratorType pastry) {
        this.pastry = pastry;
        this.toppings = new ArrayList<>();
        this.stuffings = new ArrayList<>();
    }

    public void addTopping(DecoratorType topping) {
        toppings.add(topping);
    }

    public void addStuffing(DecoratorType stuffing) {
        stuffings.add(stuffing);
    }

    public DecoratorType getPastry() {
        return pastry;
    }

    public List<DecoratorType> getToppings() {
        return toppings;
    }

    public List<DecoratorType> getStuffings() {
        return stuffings;
    }
}
