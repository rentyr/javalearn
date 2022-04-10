package First;

import java.util.Scanner;

public class ifstatements {

	// conditional statments
	// Use the if statement to specify a block of Java code to be executed if a
	// condition is true
	// Less than: a < b
	// Less than or equal to: a <= b
	// Greater than: a > b
	// Greater than or equal to: a >= b
	// Equal to a == b
	// Not Equal to: a != b

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scan.nextInt();

		if (age >= 18)
			System.out.println("Adult");
		else if (age >= 12)
			System.out.println("teenager");
		else
			System.out.println("baby");

	}
}
