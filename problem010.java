package eulerSolutions;

public class problem010 {
	// Calculates the sum of all primes below 2 million
	public static void main(String[] args) {
		long sum = 0;
		for (int i=2; i<2000000; i++) {
			if (auxiliaryMethods.isPrime(i)) sum += i;
		}
		System.out.println(sum);
	}

}
