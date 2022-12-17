

public class Ranch extends SauceDecorator {
    Burger burger;

    public Ranch(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 2.0 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Ranch";
    }

}
