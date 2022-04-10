package First;

import java.util.Scanner;

public class switches {

	public static void main(String[] args) {
		// Use the switch statement to select one of many code blocks to be executed.
		/*
		 * switch(expression) { case x: 
		 * code block 
		 * break; 
		 * case y:
		 *  code block 
		 *  break;
		 * default: code block }
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter the day");
		String day= scan.next();
		
		switch(day){
			case "Sunday": System.out.println("Weekend");
			break;
			case "Monday": System.out.println("Weekday");
			break;
			default: System.out.println("Not a valid day");

			
			
		}

	}

}
