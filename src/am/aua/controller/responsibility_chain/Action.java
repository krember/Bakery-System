package am.aua.controller.responsibility_chain;

import am.aua.model.Order;

import java.util.List;

public abstract class Action {
    protected Action next;

    public Action(Action next) {
        this.next = next;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }

    public abstract void run(List<Order> orders);
}
