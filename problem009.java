package eulerSolutions;

public class problem009 {
	public static void main(String args[]) {
		double a = 1, b = 2, c = 0, cSquared = 0;
		boolean solved = false;
		while (!solved) {
			while (a<b) {
				cSquared = a*a + b*b;
				c = Math.sqrt(cSquared);
				if (a+b+c == 1000) {
					solved = true;
					break;
				}
				if (solved) break;
				a++;
			}
			if (solved) break;
			b++;
			a = 1;
		}
		System.out.println(a*b*c);
	}
}
