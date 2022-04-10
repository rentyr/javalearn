package First;

public class swapvariable {
	public static void main(String[] args) {
		String x,y,temp;
		x= "abc";
		y= "xyz";
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);

		temp= x;
		x=y;
		y= temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);


	}

}
