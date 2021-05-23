package am.aua.model.pastry;

import am.aua.model.pastry.decorators.DecoratorType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Pastry {
    protected List<DecoratorType> toppings = new ArrayList<>();
    protected List<DecoratorType> stuffings = new ArrayList<>();

    public void addTopping(DecoratorType top) {
        toppings.add(top);
    }

    public void addStuffing(DecoratorType stuffing) {
        stuffings.add(stuffing);
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        String prefix = " with ";
        if (!toppings.isEmpty()) {
            message.append(toppings.stream()
                    .map(DecoratorType::getName)
                    .collect(Collectors.joining(", ", " with ", " on top")));
            prefix = ", and ";
        }

        if (!stuffings.isEmpty()) {
            message.append(stuffings.stream()
                    .map(DecoratorType::getName)
                    .collect(Collectors.joining(", ", prefix, " inside")));
        }

        return message.toString();
    }
}
