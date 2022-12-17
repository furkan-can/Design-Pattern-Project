

public class MiddleSize extends FriesPotatoDecorator {
	Burger burger;

	public MiddleSize(Burger burger) {
		this.burger = burger;
	}

	@Override
	public double cost() {
		return 7.5 + burger.cost();
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + ", Middle Size Fries Potato";
	}
}
