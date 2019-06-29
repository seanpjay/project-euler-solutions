package eulerSolutions;

public class problem001 {
	// Calculates the sum of all multiples of 3 and 5 that are less than 1000
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i=1; i<1000; i++) {
			if (i%3 == 0 || i%5 == 0) {
				System.out.print(i);
				if (i<999) System.out.println(" + ");
				sum += i;
			}
		}
		System.out.print("= ");
		System.out.println(sum);
	}

}
