package am.aua.bakery;

import am.aua.controller.AssistantStaff;
import am.aua.model.Kitchen;
import am.aua.view.Waiter;

import java.util.List;

public class Bakery {
    private Kitchen kitchen;
    private List<Waiter> waiters;
    private List<AssistantStaff> helpers;

    public Bakery() {
        kitchen = new Kitchen();

    }

    /*public Pastry handleCommand(all params to bake a pizza) {
        //TODO : create the chain
        kitchen.bake(the chain)
    }*/
}
