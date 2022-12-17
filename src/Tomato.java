

public class Tomato extends IngredientsDecorator {
    Burger burger;

    public Tomato(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 3.5 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }
}
