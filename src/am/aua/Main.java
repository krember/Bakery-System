package am.aua;

import am.aua.controller.Bakery;
import am.aua.model.pastry.Pastry;
import am.aua.model.pastry.decorators.basic_pastry.Decorator;
import am.aua.model.pastry.decorators.stuffing.CheeseCrustStuffing;
import am.aua.model.pastry.decorators.toppings.*;
import am.aua.model.pastry.decorators.basic_pastry.PlainPizza;
import am.aua.view.Waiter;

public class Main {

    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.newClient();

        // write your code here
    }
}
