package eulerSolutions;

public class problem007 {
	public static void main (String args[]) {
		// Calculates the 10,001st prime
		int primeCount = 0;
		int i = 2; // First prime
		while (primeCount < 10001) {
			if (auxiliaryMethods.isPrime(i)) {
				primeCount++;
			}
			i++;
		}
		System.out.println(i-1);
	}
}
