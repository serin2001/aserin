package p92;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainFood {

	public static void main(String[] args) {
		// Removes foul food from the pantry
		Consumer<List<Food>> clean = (list) -> {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).isFoul()) {
					list.remove(i);
					i--;
				}
			}
		};
		// Adds a non-foul food item to a list
		BiConsumer<Food, List<Food>> addFood = (food, list) -> {
			if (!food.isFoul()) {
				list.add(food);
			}
		};
		// Prints all foods in the pantry
		Consumer<List<Food>> display = (list) -> list.stream().forEach(a -> System.out.println(a.getType()));

		ArrayList<Food> pantry = new ArrayList<>();
		addFood.accept(new Food("Apple", false), pantry);
		addFood.accept(new Food("Banana", false), pantry);
		addFood.accept(new Food("Bread", true), pantry);

		display.accept(pantry);
		pantry.add(new Food("Cheese", true));
		display.accept(pantry);
		clean.accept(pantry);
		display.accept(pantry);
	}
}
