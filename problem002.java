package eulerSolutions;

public class problem002 {
	// Calculates the sum of Fibonacci numbers less than 4 million
	public static void main(String[] args) {
		int leftAddend = 1, rightAddend = 2, intermediateAddend = 0, sum = 0;
		while (rightAddend < 4000000) {
		    if (rightAddend%2 == 0) sum += rightAddend;
			intermediateAddend = leftAddend + rightAddend;
			leftAddend = rightAddend;
			rightAddend = intermediateAddend;
		}
		System.out.println(sum);
	}

}
