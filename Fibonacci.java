package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive, whole number: ");
		int n = input.nextInt();
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacciSequence(n));
		input.close();

	}
	/**
	 * Returns the nth term of the Fibonacci sequence.
	 * @param n this term in the Fibonacci sequence to be calculated.
	 * @return 0 the 0th term is 0.
	 * @return 1 the 1st and 2nd term are 1.
	 * @return 	 recursive call to fibonacciSequence method for terms > 2.
	 */
	public static int fibonacciSequence(int n) {
		
		if (n==0) 
			return 0;
		else if (n==1 || n==2)
			return 1;
		return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
		
	}

}
