public class HotChocolate extends Beverage {

	@Override
	public double cost() {
		return 16.0;
	}

	@Override
	public String getDescription() {
		return "Hot Chocolate";
	}
}
