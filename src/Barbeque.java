

public class Barbeque extends SauceDecorator {
    Burger burger;

    public Barbeque(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 1.5 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Barbeque";
    }
}
