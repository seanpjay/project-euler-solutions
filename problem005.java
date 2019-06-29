package eulerSolutions;

public class problem005 {

	public static void main(String[] args) {
		// Calculates the smallest integer than can be evenly divided by all integers between 1 and 20
		boolean done = false;
		int i = 0;
		// We only check multiples of 20 so we can skip all factors of 20 and check the rest.
		while (done == false) {
			i+=10;
			if (i%19 == 0 && i%18 == 0 && i%17 == 0 && i%16 == 0 && i%15 == 0 && i%14 == 0 && i%13 == 0 && i%12 == 0 && i%11 == 0 && i%9 == 0 && i%8 == 0 && i%7 == 0 && i%6 == 0 && i%3 == 0) done = true;
		}
		System.out.println(i);
	}

}
