package am.aua.model;

import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.DecoratorBuilder;
import am.aua.model.pastry.decorators.basic_pastry.PlainCroissant;
import am.aua.model.pastry.decorators.basic_pastry.PlainPancake;
import am.aua.model.pastry.decorators.basic_pastry.PlainPizza;
import am.aua.model.pastry.decorators.stuffing.CheeseCrustStuffing;
import am.aua.model.pastry.decorators.stuffing.NutellaStuffing;
import am.aua.model.pastry.decorators.stuffing.VanillaCreamStuffing;
import am.aua.model.pastry.decorators.toppings.*;

import java.util.List;
import java.util.stream.Collectors;

public class Kitchen {

    public List<Pastry> receiveOrder(List<Order> orders) {
        return orders.stream().map(this::bake).map(DecoratorBuilder::build).collect(Collectors.toList());
    }

    private DecoratorBuilder bake(Order order) {
        DecoratorBuilder pastry;
        switch (order.getPastry()) {
            case PLAIN_PANCAKE ->  pastry = new PlainPancake(null);
            case PLAIN_PIZZA ->  pastry = new PlainPizza(null);
            case PLAIN_CROISSANT ->  pastry = new PlainCroissant(null);
            default -> throw new IllegalStateException();
        }

        for (DecoratorType topping : order.getToppings()) {
            switch (topping) {
                case GOUDA -> pastry = new GoudaTopping(pastry);
                case CHOCOLATE -> pastry = new ChocolateTopping(pastry);
                case HONEY -> pastry = new HoneyTopping(pastry);
                case STRAWBERRY -> pastry = new StrawberryTopping(pastry);
                case MOZZARELLA -> pastry = new MozzarellaTopping(pastry);
                case TOMATO -> pastry = new TomatoTopping(pastry);
                case PEPPERONI -> pastry = new PepperoniTopping(pastry);
                default -> throw new IllegalStateException();
            }
        }
        for (DecoratorType stuffing : order.getStuffings()) {
            switch (stuffing) {
                case CHEESE_CRUST -> pastry = new CheeseCrustStuffing(pastry);
                case NUTELLA -> pastry = new NutellaStuffing(pastry);
                case VANILLA_CREAM -> pastry = new VanillaCreamStuffing(pastry);
                default -> throw new IllegalStateException();
            }
        }

        return pastry;
    }

}
