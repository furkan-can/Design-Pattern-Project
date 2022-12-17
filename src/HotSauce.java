

public class HotSauce extends SauceDecorator {
    Burger burger;

    public HotSauce(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return 1.25 + burger.cost();
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Hot Sauce";
    }
}
