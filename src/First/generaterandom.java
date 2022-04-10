package First;

import java.util.Random;

public class generaterandom {

	public static void main(String[] args) {

		Random random = new Random();

		// genarate a random ingeger
		int x = random.nextInt(7);
		System.out.println("random integer is " + x);

		// generate a random double
		double y = random.nextDouble(100);
		System.out.println("random double is " + y);
		
		//generate a rendom boolean
		boolean z = random.nextBoolean();
		System.out.println("random boolean is " + z);

	}

}
