package am.aua;

import am.aua.model.pastry.Croissant;
import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.decorators.DecoratorType;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;
import am.aua.model.pastry.decorators.basic_pastry.PlainCroissant;
import am.aua.model.pastry.decorators.stuffing.CheeseCrustStuffing;
import am.aua.model.pastry.decorators.stuffing.NutellaStuffing;
import am.aua.model.pastry.decorators.toppings.*;
import am.aua.model.pastry.decorators.basic_pastry.PizzaDecorator;
import am.aua.view.Waiter;

public class Main {

    public static void main(String[] args) {
//        Decorator croissant;
//        croissant = new PlainCroissant(null);
//        croissant = new ChocolateTopping(croissant);
//        croissant = new NutellaStuffing(croissant);
//
//        System.out.println(croissant.getDescription());
//        System.out.println("Overall price: $" + croissant.getPrice());
//
//        Pastry croissantBuilt = croissant.build();
//
//        System.out.println(croissantBuilt);

        Decorator pizza;
        pizza = new PizzaDecorator(null);
        pizza = new TomatoTopping(pizza);
        pizza = new MozzarellaTopping(pizza);
        pizza = new PepperoniTopping(pizza);
        pizza = new CheeseCrustStuffing(pizza);

        Pastry pizzaBuilt = pizza.build();
        System.out.println(pizzaBuilt);

        Waiter waiter = new Waiter();
        waiter.startOrder();
        // write your code here
    }
}
