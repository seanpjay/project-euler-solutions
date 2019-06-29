package eulerSolutions;

public class problem004 {
	
	// Calculates the largest number that is both a palindrome and the product of two three-digit factors
	public static void main (String args[]) {
		// Check all 6-digit palindromes
		boolean done = false;
		int palindrome = 0;
		for (int i=999; i>=100; i--) {
			palindrome = i*1000 + auxiliaryMethods.reverseInt(i);
			for (int j=999; j>=100; j--) {
				if (palindrome%j == 0) {
					int quotient = palindrome/j;
					if (quotient > 99 && quotient < 1000) {
						done = true;
						break;
					}
				}
			}
			if (done) {
				break;
			}
		}
		System.out.println(palindrome);
	}
}
