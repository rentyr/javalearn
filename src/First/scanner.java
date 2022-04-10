package First;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter you job");
		String job = scan.nextLine();
		System.out.println("Name is " + name);
		System.out.println("Age: " + age);
		System.out.println("Job:: " + job);

	}

}
