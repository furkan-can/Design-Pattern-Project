

public class BigSize extends FriesPotatoDecorator {
	Burger burger;

	public BigSize(Burger burger) {
		this.burger = burger;
	}

	@Override
	public double cost() {
		return 8.5 + burger.cost();
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + ", Big Size Fries Potato";
	}
}
