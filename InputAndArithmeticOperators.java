package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		float num1, num2, result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		num1 = s.nextFloat();
		
		System.out.print("Enter Second Number: ");
		num2 = s.nextFloat();
		
		System.out.println();
		
		result = num1 * num2;
		System.out.println("Result: " + num1 + " * " + num2 + " = " + result);

	}

}
