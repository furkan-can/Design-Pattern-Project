

public class SmallSize extends FriesPotatoDecorator {
	Burger burger;

	public SmallSize(Burger burger) {
		this.burger = burger;
	}

	@Override
	public double cost() {
		return 5.5 + burger.cost();
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + ", Small Size Fries Potato";
	}
}
