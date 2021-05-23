package am.aua.controller;

import am.aua.controller.responsibility_chain.Action;
import am.aua.controller.responsibility_chain.KitchenAction;
import am.aua.controller.responsibility_chain.WaiterAction;
import am.aua.model.Kitchen;
import am.aua.view.Waiter;

import java.util.LinkedList;
import java.util.List;

public class Bakery {
    private static final int NUMBER_OF_WAITERS = 5;

    private List<Action> responsibilityChain = new LinkedList<>();

    public Bakery() {
        Kitchen kitchen = new Kitchen();
        responsibilityChain.add(0, new KitchenAction(kitchen, null));
        for(int  i =0; i < NUMBER_OF_WAITERS; ++i) {
            responsibilityChain.add(0, new WaiterAction(new Waiter(), responsibilityChain.get(0)));
        }
    }

    public void newClient() {
        responsibilityChain.get(0).run(null);
    }
}
