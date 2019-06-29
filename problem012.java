package eulerSolutions;

public class problem012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, numDivisors = 0;
		long currTriangleNum = 1;
		boolean solved = false;
		while (!solved) {
			for (int j = 1; j<=currTriangleNum/2; j++) {
				if (currTriangleNum%j == 0) numDivisors++;
			}
			if (numDivisors > 500) solved = true;
			else {
				numDivisors = 0;
				currTriangleNum += i;
				i++;
			}
		}
		System.out.println(currTriangleNum);
	}

}
