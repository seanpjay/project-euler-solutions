package eulerSolutions;

public class problem006 {

	public static void main(String[] args) {
		// Calculates the difference between the sum of the squares from 1 to 100 (1^2 + 2^2 + ... + 100^2) and the square of the sum of the same limit (1 + 2 + ... + 100)^2
		int squareOfSum = 0;
		for (int i = 0; i<=100; i++) squareOfSum+=i;
		squareOfSum *= squareOfSum;
		
		int sumOfSquares = 0;
		for (int i = 0; i<=100; i++) sumOfSquares += (i*i);
		
		System.out.println(squareOfSum - sumOfSquares);
	}
}
