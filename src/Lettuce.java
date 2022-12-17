

public class Lettuce extends IngredientsDecorator {
    Burger burger;

    public Lettuce(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 5.5 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Lettuce";
    }

}
