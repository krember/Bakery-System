package am.aua.model.pastry.decorators;

public enum DecoratorType {
    PLAIN_PIZZA("Pizza"),
    PLAIN_PANCAKE("Pancake"),
    PLAIN_CROISSANT("Croissant"),
    STRAWBERRY("Strawberry"),
    CHOCOLATE("Chocolate"),
    MOZZARELLA("Mozzarella"),
    GOUDA("Gouda"),
    NUTELLA("Nutella"),
    VANILLA_CREAM("Vanilla cream"),
    NONE("Cancel");

    private final String name;

    DecoratorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
