

public class BurgerOrder implements Command {
	String order;
	Chef chef;
	String[] burgerIngredientsList, burgerFriesPotatoList, burgerSauceList;

	public BurgerOrder(Chef chef, String order, String[] burgerIngredientsList, String[] burgerFriesPotatoList,
			String[] burgerSauceList) {
		this.chef = chef;
		this.order = order;
		this.burgerFriesPotatoList = burgerFriesPotatoList;
		this.burgerSauceList = burgerSauceList;
		this.burgerIngredientsList = burgerIngredientsList;
	}

	@Override
	public void toOrder() {
		chef.burgerType = order;
		chef.burgerFriesPotatoList = burgerFriesPotatoList;
		chef.burgerSauceList = burgerSauceList;
		chef.burgerIngredientList = burgerIngredientsList;
		chef.getOrder("burger");
	}
}
