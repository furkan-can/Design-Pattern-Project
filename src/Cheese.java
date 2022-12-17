

public class Cheese extends IngredientsDecorator {
	Burger burger;

	public Cheese(Burger burger) {
		this.burger = burger;
	}

	@Override
	public double cost() {
		return 8.0 + burger.cost();
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + ", Cheese";
	}
}
