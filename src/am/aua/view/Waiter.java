package am.aua.view;

import am.aua.model.Order;
import am.aua.model.pastry.decorators.DecoratorType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Waiter {
    private enum OrderState {
        SELECT_PASTRY,
        SELECT_TOPPINGS,
        SELECT_STUFFINGS,
        DONE
    }

    private final List<DecoratorType> plainPastry = List.of(
            DecoratorType.PLAIN_PANCAKE,
            DecoratorType.PLAIN_CROISSANT,
            DecoratorType.PLAIN_PIZZA);

    private final List<DecoratorType> toppings = List.of(
            DecoratorType.CHOCOLATE,
            DecoratorType.GOUDA,
            DecoratorType.MOZZARELLA,
            DecoratorType.HONEY,
            DecoratorType.STRAWBERRY,
            DecoratorType.PEPPERONI,
            DecoratorType.TOMATO);

    private final List<DecoratorType> stuffings = List.of(
            DecoratorType.CHEESE_CRUST,
            DecoratorType.NUTELLA,
            DecoratorType.VANILLA_CREAM);

    private OrderState currentState = OrderState.SELECT_PASTRY;
    private final Scanner reader = new Scanner(System.in);
    private List<Order> orders = new ArrayList<>();
    private Order currentOrder;
    private boolean orderInProgress = false;

    public List<Order> startOrder() {
        while (true) {
            orderInProgress = true;
            switch (currentState) {
                case SELECT_PASTRY -> handlePastryState();
                case SELECT_TOPPINGS -> handleTopping();
                case SELECT_STUFFINGS -> handleStuffing();
                case DONE -> {
                    List<Order> pOrder = orders;
                    finish();
                    return pOrder;
                }
            }
        }
    }

    private void handlePastryState() {
        List<Integer> selectionNumbers = printOptions(plainPastry, "What would you like:");

        if(selectionNumbers.size() != 1) {
            System.out.println("Invalid input");
            return;
        }
        DecoratorType selection = plainPastry.get(selectionNumbers.get(0));
        currentOrder = new Order(selection);
        currentState = OrderState.SELECT_TOPPINGS;
    }

    private void handleTopping() {
        List<Integer> selectionNumbers = printOptions(toppings, "What toppings would you like:");

        for(Integer selectionNumber : selectionNumbers) {
            DecoratorType selection = toppings.get(selectionNumber);
            currentOrder.addTopping(selection);
        }
        currentState = OrderState.SELECT_STUFFINGS;
    }

    private void handleStuffing() {
        List<Integer> selectionNumbers = printOptions(stuffings, "What stuffing would you like:");

        for(Integer selectionNumber : selectionNumbers) {
            DecoratorType selection = stuffings.get(selectionNumber);
            currentOrder.addStuffing(selection);
        }

        orders.add(currentOrder);
        String input;
        do {
            System.out.print("Would you like to continue your order (y/n) -> ");
            input = reader.next();
        }
        while (!input.equals("y") && !input.equals("n"));
        if(input.equals("y")) {
            currentState = OrderState.SELECT_PASTRY;
        } else {
            currentState = OrderState.DONE;
        }
    }

    private List<Integer> printOptions(List<DecoratorType> options, String message) {
        System.out.println(message);
        for (int i = 0; i < options.size(); ++i) {
            System.out.println("[" + (i + 1) + "] " + options.get(i).getName());
        }
        System.out.print("Select your options -> ");
        String selections = reader.nextLine();
        String[] selectionsNumberStr = selections.split(" ");

        List<Integer> selectionsNumbers = new ArrayList<>();
        int slNumber;

        for (String selectionStr: selectionsNumberStr) {
            try {
                slNumber = Integer.parseInt(selectionStr);

                if(slNumber < 1 || slNumber > options.size()) {
                    System.out.println("Invalid option : " + selectionStr);
                } else {
                    selectionsNumbers.add(slNumber - 1);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid option : " + selectionStr);
            }
        }

        return selectionsNumbers;
    }

    private void finish() {
        currentState = OrderState.SELECT_PASTRY;
        orders = new ArrayList<>();
        orderInProgress = false;
        currentOrder = null;
    }

    public boolean isFree() {
        return !orderInProgress;
    }
}
