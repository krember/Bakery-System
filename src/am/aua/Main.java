package am.aua;

import am.aua.model.pastry.decorators.toppings.GoudaTopping;
import am.aua.model.pastry.decorators.basic_pastry.PizzaDecorator;

public class Main {

    public static void main(String[] args) {
        PizzaDecorator pizzaBase = new PizzaDecorator(null);
        GoudaTopping pizzaWithGouda = new GoudaTopping(pizzaBase);
        GoudaTopping pizzaWithDoubleGouda = new GoudaTopping(pizzaWithGouda);
	    // write your code here
    }
}
