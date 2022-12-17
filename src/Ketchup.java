

public class Ketchup extends SauceDecorator {
    Burger burger;

    public Ketchup(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 1.0 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Ketchup";
    }
}
