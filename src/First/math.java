package First;

public class math {

	public static void main(String[] args) {
		double x, y, z, a, b, c, e;
		x = 23.11;
		y = -24;

		// maximum of 2 numbers
		z = Math.max(x, y);
		System.out.println(z);

		// minumum of 2 numbers
		a = Math.min(x, y);
		System.out.println(a);

		// absolute value of a number
		b = Math.abs(y);
		System.out.println(b);

		// square root of a number
		c = Math.sqrt(x);
		System.out.println(c);

		// rounding off a number
		e = Math.round(x);
		System.out.println(e);

	}

};
