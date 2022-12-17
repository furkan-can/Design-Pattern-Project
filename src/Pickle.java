

public class Pickle extends IngredientsDecorator {
    Burger burger;

    public Pickle(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 4.5 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Pickle";
    }
}
