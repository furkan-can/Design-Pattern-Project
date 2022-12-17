
import java.util.ArrayList;

public class Chef {
	String beverageType, burgerType;

	String[] burgerIngredientList, burgerFriesPotatoList, burgerSauceList;

	ArrayList<Beverage> beverageList = new ArrayList<>();
	ArrayList<Burger> burgerList = new ArrayList<>();
	double totalCost = 0;

	public void getOrder(String factoryType) {
		switch (factoryType) {
		case "burger":
			BurgerFactory burgerFactory = new BurgerFactory();
			Burger orderedBurger = burgerFactory.produceBurger(burgerType,burgerIngredientList, burgerFriesPotatoList, burgerSauceList);
			System.out.println(orderedBurger.getDescription() + " order reveived.\n");
			burgerList.add(orderedBurger);
			break;

		case "beverage":
			BeverageFactory beverageFactory = new BeverageFactory();
			Beverage orderedBeverage = beverageFactory.produceBeverage(beverageType);
			System.out.println(orderedBeverage.getDescription() + " order reveived.\n");
			beverageList.add(orderedBeverage);
			break;
		}

	}

	public double totalOrder() {
		for (int i = 0; i < burgerList.size(); i++) {
			burgerList.get(i).toService(burgerList.get(i).getDescription());
			System.out.println(burgerList.get(i).getDescription() + " cost - " + burgerList.get(i).cost());
			totalCost += burgerList.get(i).cost();
		}

		for (int i = 0; i < beverageList.size(); i++) {
			beverageList.get(i).toService(beverageList.get(i).getDescription());
			totalCost += beverageList.get(i).cost();
			System.out.println(
					beverageList.get(i).getDescription() + " cost is - " + beverageList.get(i).cost());
		}

		return totalCost;
	}

	
}
