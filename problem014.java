package eulerSolutions;

public class problem014 {

	public static void main(String[] args) {
		// Find the length of the longest Collatz sequence with a starting term under 1 million.
		long curr = 0, sequenceLength = 0, highestSequenceLength = 0, highestStartingTerm = 0;
		for (int i=1; i<1000000; i++) {
			curr = i;
			sequenceLength = 0;
			while (curr != 1) {
				sequenceLength++;
				if (curr%2 == 0) {
					curr = curr/2;
				}
				else {
					curr = (curr*3)+1;
				}
			}
			if (sequenceLength > highestSequenceLength) {
				highestSequenceLength = sequenceLength;
				highestStartingTerm = i;
				System.out.println(highestStartingTerm);
			}
		}
	}

}
