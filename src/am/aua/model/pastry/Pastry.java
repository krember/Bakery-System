package am.aua.model.pastry;

import am.aua.model.pastry.decorators.DecoratorType;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
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
        String toppingString = toppings.stream()
                .map(DecoratorType::getName)
                .collect(Collectors.joining(", ", " with ", " on top"));
        String stuffingsString = stuffings.stream()
                .map(DecoratorType::getName)
                .collect(Collectors.joining(", ", ", and ", " inside"));

        return toppingString + stuffingsString;
    }
}
