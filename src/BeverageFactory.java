
public class BeverageFactory {
    public Beverage produceBeverage(String beverageType) {
    	if (beverageType.equals("ayran"))
			return new Ayran();
		else if (beverageType.equals("cola"))
			return new Cola();
		else if (beverageType.equals("fanta"))
			return new Fanta();
		else if (beverageType.equals("water"))
			return new Water();
		else if (beverageType.equals("coffee"))
			return new Coffee();
		else if (beverageType.equals("hotchocolate"))
			return new HotChocolate();
		else if (beverageType.equals("tea"))
			return new Tea();
		else
			return null;
    }
}
