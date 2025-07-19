package p41;

public class WrapperTask {

	public static void main(String[] args) {
		char[] values = { '1', 'a', '3', 'z', '9' };
		int[] nums = { 10, 0, -4, 20, 5 };

		System.out.println("Digits (primitive): " + countDigitsPrimitive(values));
		System.out.println("Digits (wrapper): " + countDigitsWrapper(values));
		System.out.println("Max (primitive): " + maxPrimitive(nums));
		System.out.println("Max (wrapper): " + maxWithWrapper(nums));
	}

	public static int countDigitsPrimitive(char[] values) {
		int count = 0;
		for (char c : values) {
			if (c >= '0' && c <= '9')
				count++;
		}
		return count;
	}

	public static int countDigitsWrapper(char[] values) {
		int count = 0;
		for (char c : values) {
			if (Character.isDigit(c))
				count++;
		}
		return count;
	}

	public static int maxPrimitive(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
		}
		return max;
	}

	public static int maxWithWrapper(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (Integer.compare(nums[i], max) > 0)
				max = nums[i];
		}
		return max;
	}
}
/*
 * Autoboxing is the automatic conversion of a primitive type into its
 * corresponding wrapper class. Autoboxing allows you to use primitive
 * values where objects are expected, such as in Collections (like ArrayList).
 * 
 * Unboxing is the automatic conversion of a wrapper class object back into its
 * corresponding primitive type. This occurs when a wrapper class object is used
 * in a context where a primitive type is expected.
 * 
 * Use Cases: Autoboxing: 1) Storing primitive values in Collections (like
 * ArrayList, HashMap, etc.), which can only store objects. Autoboxing
 * automatically converts primitive types to their wrapper class when adding
 * elements. 2) Passing a primitive value to a method that expects an object.
 * 
 * Use Cases: Unboxing: 1) Performing arithmetic operations with wrapper
 * classes. 2) Retrieving values from collections that store wrapper classes. 
 * When you retrieve an Integer from an ArrayList and need to use it in a computation,
 * unboxing converts it to an int for the operation.
 * 
 * List<Integer> integerList = new ArrayList<>();
 * integerList.add(5); // Autoboxing occurs here
 * integerList.add(10); // Autoboxing occurs here
 * 
 * int sum = 0;
 * for (Integer num : integerList) {
 *     sum += num; // Unboxing occurs here
 * }
 */