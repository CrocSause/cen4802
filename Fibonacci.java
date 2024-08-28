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
	
	public static int fibonacciSequence(int n) {
		
		if (n==0) 
			return 0;
		else if (n==1 || n==2)
			return 1;
		return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
		
	}

}
