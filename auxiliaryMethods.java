package eulerSolutions;

public class auxiliaryMethods {
	public static boolean isPrime(double input) {
		// Returns true if a given positive double is prime
		if (input == 1) return false;
		if (input < 4 || input == 5) return true;
		if (input%2 == 0 || input%3 == 0 || input%5 == 0) return false;
		int sqrt = (int)Math.sqrt(input);
		
		for (int i=6; i<=sqrt; i++) {
			if (input%i == 0) return false;
		}
		
		return true;
	}
	
	public boolean isFactor(double input, double factor) {
		if (input%factor == 0) return true;
		else return false;
	}
	
	public static int reverseInt(int input) {
		// Reverses an integer and clears leading zeroes (three digit max)
		int ones, tens, hundreds;
		while (input%10 == 0) input /= 10;
		if (input > 99) {
			ones = input%10;
			tens = (input%100 - ones)/10;
			hundreds = input/100;
			return ones*100 + tens*10 + hundreds;
		}
		else if (input > 9) {
			ones = input%10;
			tens = input/10;
			return ones*10 + tens;
		}
		else return input;
	}
}
