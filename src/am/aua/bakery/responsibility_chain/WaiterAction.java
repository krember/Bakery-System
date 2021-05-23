package am.aua.bakery.responsibility_chain;

import am.aua.model.Order;
import am.aua.view.Waiter;

import java.util.List;

public class WaiterAction extends Action {
    private Waiter waiter;

    public WaiterAction(Action next) {
        super(next);
    }

    public WaiterAction(Waiter waiter, Action next) {
        super(next);
    }

    @Override
    public void run(List<Order> orders) {
        if(orders == null && waiter.isFree()) {
            orders = waiter.startOrder();
        }
        next.run(orders);
    }
}
