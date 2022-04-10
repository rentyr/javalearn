package First;

public class LogicalOperators {

	public static void main(String[] args) {
		// && AND
		// || OR
		// ! NOT

		// && operator
		System.out.println((5 > 3) && (8 > 5)); // true
		System.out.println((5 > 3) && (8 < 5)); // false

		// || operator
		System.out.println((5 < 3) || (8 > 5)); // true
		System.out.println((5 > 3) || (8 < 5)); // true
		System.out.println((5 < 3) || (8 < 5)); // false

		// ! operator
		System.out.println(!(5 == 3)); // true
		System.out.println(!(5 > 3)); // false
	}

}
