package am.aua.controller;

import am.aua.controller.responsibility_chain.Action;
import am.aua.model.Kitchen;
import am.aua.view.Waiter;

import java.util.List;

public class Bakery {
    private Kitchen kitchen;
    private List<Waiter> waiters;

    public Bakery() {
        kitchen = new Kitchen();

    }
}
