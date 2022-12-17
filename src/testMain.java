import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author FURKAN CAN TAVUKCU
 * 
 * @since  13.12.2021
 *
 */

public class testMain {
	private static Chef chef = new Chef();
	private static Cashier cashier = new Cashier();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("********* WELCOME TO TAVUKCU BURGER HOUSE *********\n\n");
		toOrder();
		System.out.println("\n\nThank you for choosing us. We hope you come again.\n***** Total Cost : "
				+ chef.totalOrder() + " *****");

	}

	private static void toOrder() {
		int orderType;
		do {
			System.out.println("What would you like to order?");
			System.out.println("1 - Burger");
			System.out.println("2 - Beverage");
			System.out.println("0 - I have finished ordering. Prepare please.");

			System.out.print("Your choice: ");
			orderType = scan.nextInt();

			if (orderType == 1) {
				selectMeat();
			} else if (orderType == 2) {
				selectBeverageType();
			} else if (orderType != 0) {
				System.out.println("\nInvalid Transaction\n");
			}

		} while (orderType != 0);
	}

	private static void selectMeat() {
		int selection;
		do {
			System.out.println("What kind of meat should your burger be made of?");
			System.out.println("1 - Beef");
			System.out.println("2 - Chicken");
			System.out.println("0 - I don't want to eat Burger. Back step.");

			System.out.print("Your choice: ");
			selection = scan.nextInt();

			if (selection == 1) {
				BurgerOrder burgerWithBeef = createMenu("Beef");
				cashier.getOrder(burgerWithBeef);
			} else if (selection == 2) {
				BurgerOrder burgerWithChicken = createMenu("Chicken");
				cashier.getOrder(burgerWithChicken);
			} else if (selection != 0) {
				System.out.println("\nInvalid Transaction\n");
			}
		} while (selection != 0);

	}

	private static BurgerOrder createMenu(String order) {
		ArrayList<String> sauceList = new ArrayList<>();
		ArrayList<String> ingredientsList = new ArrayList<>();
		ArrayList<String> friesPotatoList = new ArrayList<>();
		int selection;
		do {
			System.out.println("What would you like with your burger?");
			System.out.println("1 - Ingredients");
			System.out.println("2 - Sauce");
			System.out.println("3 - Fries Potato");
			System.out.println("0 - Nothing");

			System.out.print("Your choice: ");
			selection = scan.nextInt();

			if (selection == 1) {
				System.out.println("Which ingredients do you want?");
				System.out.println("1 - Cheese");
				System.out.println("2 - Lettuce");
				System.out.println("3 - Tomato");
				System.out.println("4 - Onion");
				System.out.println("5 - Pickle");
				System.out.println("0 - Nothing");

				System.out.print("Your choice: ");
				int ingredients = scan.nextInt();

				switch (ingredients) {
				case 1:
					ingredientsList.add("cheese");
					break;
				case 2:
					ingredientsList.add("lettuce");
					break;
				case 3:
					ingredientsList.add("tomato");
					break;
				case 4:
					ingredientsList.add("onion");
					break;
				case 5:
					ingredientsList.add("pickle");
					break;
				}
			} else if (selection == 2) {
				System.out.println("Which sauce do you want?");
				System.out.println("1 - Barbeque");
				System.out.println("2 - Hot Sauce");
				System.out.println("3 - Ketchup");
				System.out.println("4 - Mayonnaise");
				System.out.println("5 - Ranch");
				System.out.println("0 - Nothing");

				System.out.print("Your choice: ");
				int sauce = scan.nextInt();

				switch (sauce) {
				case 1:
					sauceList.add("barbeque");
					break;
				case 2:
					sauceList.add("hotsauce");
					break;
				case 3:
					sauceList.add("ketchup");
					break;
				case 4:
					sauceList.add("mayonnaise");
					break;
				case 5:
					sauceList.add("ranch");
					break;

				}
			} else if (selection == 3) {
				System.out.println("Which fries potato size do you want?");
				System.out.println("1 - Big Size");
				System.out.println("2 - Middle Size");
				System.out.println("3 - Small Size");
				System.out.println("0 - Nothing");

				System.out.print("Your choice: ");
				int friesPotato = scan.nextInt();

				switch (friesPotato) {
				case 1:
					friesPotatoList.add("big");
					break;
				case 2:
					friesPotatoList.add("middle");
					break;
				case 3:
					friesPotatoList.add("small");
					break;
				}
			} else if (selection != 0) {
				System.out.println("\nInvalid Transaction\n");
			}
		} while (selection != 0);

		String[] sauceArray = new String[sauceList.size()];
		String[] friesPotatoArray = new String[friesPotatoList.size()];
		String[] ingredientsArray = new String[ingredientsList.size()];

		sauceArray = sauceList.toArray(sauceArray);
		ingredientsArray = ingredientsList.toArray(ingredientsArray);
		friesPotatoArray = friesPotatoList.toArray(friesPotatoArray);
		return new BurgerOrder(chef, order, ingredientsArray, friesPotatoArray, sauceArray);
	}

	private static void selectBeverageType() {
		int beverageType;
		do {
			System.out.println("Which type of beverage do you want to drink?");
			System.out.println("1 - Hot");
			System.out.println("2 - Cold");
			System.out.println("0 - I don't want to drink beverage. Back step.");

			System.out.print("Your choice: ");
			beverageType = scan.nextInt();

			if (beverageType == 1) {
				selectHotBeverage();
			} else if (beverageType == 2) {
				selectColdBeverage();
			} else if (beverageType != 0) {
				System.out.println("\nInvalid Transaction\n");
			}

		} while (beverageType != 0);

	}

	private static void selectColdBeverage() {
		System.out.println("Which drink do you prefer?");
		System.out.println("1 - Ayran");
		System.out.println("2 - Cola");
		System.out.println("3 - Fanta");
		System.out.println("4 - Water");
		System.out.println("0 - Nothing");

		System.out.print("Your choice: ");
		int coldSelection = scan.nextInt();

		switch (coldSelection) {
		case 1:
			BeverageOrder ayranOrder = new BeverageOrder(chef, "ayran");
			cashier.getOrder(ayranOrder);
			break;
		case 2:
			BeverageOrder colaOrder = new BeverageOrder(chef, "cola");
			cashier.getOrder(colaOrder);
			break;
		case 3:
			BeverageOrder fantaOrder = new BeverageOrder(chef, "fanta");
			cashier.getOrder(fantaOrder);
			break;
		case 4:
			BeverageOrder waterOrder = new BeverageOrder(chef, "water");
			cashier.getOrder(waterOrder);
			break;
		default:
			break;
		}
	}

	private static void selectHotBeverage() {
		System.out.println("Which drink do you prefer?");
		System.out.println("1 - Coffee");
		System.out.println("2 - Hot Chocolate");
		System.out.println("3 - Tea");
		System.out.println("0 - Nothing");

		System.out.print("Your choice: ");
		int hotSelection = scan.nextInt();

		switch (hotSelection) {
		case 1:
			BeverageOrder coffeeorder = new BeverageOrder(chef, "coffee");
			cashier.getOrder(coffeeorder);
			break;
		case 2:
			BeverageOrder chocolatteOrder = new BeverageOrder(chef, "hotchocolate");
			cashier.getOrder(chocolatteOrder);
			break;
		case 3:
			BeverageOrder teaOrder = new BeverageOrder(chef, "tea");
			cashier.getOrder(teaOrder);
			break;

		default:
			break;
		}
	}

}
