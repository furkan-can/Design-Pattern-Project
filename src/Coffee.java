public class Coffee extends Beverage {

	@Override
	public double cost() {
		return 10.0;
	}

	@Override
	public String getDescription() {
		return "Coffee";
	}
}
