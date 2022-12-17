

public abstract class Beverage {
	public abstract String getDescription();

	public abstract double cost();

	public void toService(String type) {
		System.out.println("Your " + type + " will be served after payment.");
	}
}
