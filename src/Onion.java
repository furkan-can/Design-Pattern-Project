

public class Onion extends IngredientsDecorator {
    Burger burger;

    public Onion(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 2.5 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Onion";
    }
}
