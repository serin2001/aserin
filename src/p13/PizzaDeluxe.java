package p13;

import java.util.Scanner;

public class PizzaDeluxe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] toppings = {"Salami", "Pineapple", "Cheese", "Spinach", "Garlic"};
		double[] prices = {1.0, 1.5, 1.0, 0.8, 0.5};
		double basePrice = 7.0;
		
		System.out.println("Welcome to Pizza Deluxe!");
		for (int i = 0; i < toppings.length; i++)
			System.out.printf("%d = %s (%.2f Euro)%n", i+1, toppings[i], prices[i]);
		
		System.out.println("Choose your toppings (e.g., 1 3 4): ");
		String input = scanner.nextLine();
		String[] choices = input.trim().split("\\s");
		
		double total = basePrice;
		boolean hasSalami = false;
		boolean hasPineapple = false;
		boolean hasCheese = false;
		boolean hasGarlic = false;
		boolean hasSpinach = false;
		
		System.out.println("Your toppings: ");
		for (String choice : choices) {
			try {
				int index = Integer.parseInt(choice) - 1;
				if (index >= 0 && index < toppings.length) {
					String topping = toppings[index];
					System.out.println("- " + topping);
					total += prices[index];
					
					if(topping.equals("Salami"))
						hasSalami = true;
					if(topping.equals("Pineapple"))
						hasPineapple = true;
					if(topping.equals("Cheese"))
						hasCheese = true;
					if(topping.equals("Garlic"))
						hasGarlic = true;
					if(topping.equals("Spinach"))
						hasSpinach = true;
				
				} else {
					System.out.println("Invalid choice: " + choice);
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid choice: " + e.getMessage());
			}
		}
		
		if (hasSalami && hasPineapple)
			System.out.println("Taste police activated! ");
		if (hasSalami && hasPineapple && hasCheese && hasGarlic && hasSpinach)
			System.out.println("Daring today, aren't we? ");
		if (choices.length > 3)
			System.out.println("Deluxe mode unlocked! ");
		if(total > 4)
			System.out.println("High roller! ");
		scanner.close();
	}
}
