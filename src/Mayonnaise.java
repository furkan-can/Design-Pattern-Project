

public class Mayonnaise extends SauceDecorator {
    Burger burger;

    public Mayonnaise(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 1.0 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Mayonnise";
    }
}
