package am.aua.model;

import am.aua.model.pastry.Croissant;
import am.aua.model.pastry.Pancake;
import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.Pizza;
import am.aua.model.pastry.decorators.DecoratorType;

import java.util.List;
import java.util.stream.Collectors;

public class Kitchen {

    public List<Pastry> receiveOrder(List<Order> orders) {
        return orders.stream().map(this::bake).collect(Collectors.toList());
    }

    private Pastry bake(Order order) {
        Pastry pastry;
        switch (order.getPastry()) {
            case PLAIN_PANCAKE ->  pastry = new Pancake();
            case PLAIN_PIZZA ->  pastry = new Pizza();
            case PLAIN_CROISSANT ->  pastry = new Croissant();
            default -> throw new IllegalStateException();
        }

        order.getToppings().forEach(pastry::addTopping);
        order.getStuffings().forEach(pastry::addStuffing);

        return pastry;
    }

}
