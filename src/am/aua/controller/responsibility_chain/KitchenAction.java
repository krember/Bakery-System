package am.aua.controller.responsibility_chain;

import am.aua.model.Kitchen;
import am.aua.model.Order;
import am.aua.model.pastry.Pastry;

import java.util.List;

public class KitchenAction extends Action {
    private Kitchen kitchen;

    public KitchenAction(Action next) {
        super(next);
    }

    public KitchenAction(Kitchen kitchen, Action next) {
        super(next);
        this.kitchen = kitchen;
    }

    @Override
    public void run(List<Order> orders) {
        List<Pastry> result = kitchen.receiveOrder(orders);
        result.forEach(System.out::println);
    }
}
