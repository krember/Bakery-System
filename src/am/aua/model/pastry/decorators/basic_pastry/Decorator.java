package am.aua.model.pastry.decorators.basic_pastry;

public abstract class Decorator {
    private Decorator base;

    public Decorator(Decorator base) {
        this.base = base;
    }
}
