package assignment.daywise;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number want to print factorial:");
		int num = in.nextInt();
		int fact = 1;
		for (int i = 1; i < num; i++) {
			fact = fact + fact * i;
		}
		System.out.println("Factorial is:"+fact);
		in.close();
	}
}
