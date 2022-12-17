public class BurgerFactory {
	public Burger produceBurger(String burgerType,String[] burgerIngredientList, String[] burgerFriesPotatoList,
			String[] burgerSauceList) {
		if (burgerType.equals("Beef"))
			
			return decorate(new Beef(),burgerIngredientList, burgerFriesPotatoList, burgerSauceList);
		else if (burgerType.equals("Chicken"))
			return decorate(new Chicken(),burgerIngredientList, burgerFriesPotatoList, burgerSauceList);
		else
			return null;
	}
	
	public Burger decorate(Burger burger, String[] burgerIngredientList, String[] burgerFriesPotatoList,
			String[] burgerSauceList) {

		for (int i = 0; i < burgerIngredientList.length; i++) {
			switch (burgerIngredientList[i].toLowerCase()) {
			case "cheese":
				burger = new Cheese(burger);
				break;
			case "lettuce":
				burger = new Lettuce(burger);
				break;
			case "onion":
				burger = new Onion(burger);
				break;
			case "pickle":
				burger = new Pickle(burger);
			case "tomato":
				burger = new Tomato(burger);
				break;
			default:
				break;

			}
		}

		for (int i = 0; i < burgerFriesPotatoList.length; i++) {
			switch (burgerFriesPotatoList[i].toLowerCase()) {
			case "big":
				burger = new BigSize(burger);
				break;
			case "middle":
				burger = new MiddleSize(burger);
				break;
			case "small":
				burger = new SmallSize(burger);
				break;
			default:
				break;

			}
		}

		for (int i = 0; i < burgerSauceList.length; i++) {
			switch (burgerSauceList[i].toLowerCase()) {
			case "barbeque":
				burger = new Barbeque(burger);
				break;
			case "hotsauce":
				burger = new HotSauce(burger);
				break;
			case "ketchup":
				burger = new Ketchup(burger);
				break;
			case "mayonnaise":
				burger = new Mayonnaise(burger);
				break;
			case "ranch":
				burger = new Ranch(burger);
				break;
			default:
				break;

			}
		}
		return burger;
	}
}
