package eulerSolutions;

import java.util.Scanner;

public class problem003 {
	
	// Calculates the largest prime factor of a given double
	public static void main(String[] args) {
		System.out.println("Input number:");
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		scanner.close();
		int sqrt = (int)Math.sqrt(input);
		
		for (int i=2; i<=sqrt; i++) {
			if (input%i == 0) {
				input /= i;
				i = 2;
				if (auxiliaryMethods.isPrime(input)) {
					break;
				}
			}
		}
		
		System.out.println(input);
	}

}
