package javaFundamentals;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float num1, num2, result;
		int operator;
		
		System.out.println("Choose an operator: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Your Choice: ");
		operator = s.nextInt();
		
		if(operator == 1) {
			System.out.print("Enter First Number: ");
			num1 = s.nextFloat();
			System.out.print("Enter Second Number: ");
			num2 = s.nextFloat();
			
			result = num1 + num2;
			
			System.out.println("The Sum Is: " + result);
		}
		else if(operator == 2) {
			System.out.print("Enter First Number: ");
			num1 = s.nextFloat();
			System.out.print("Enter Second Number: ");
			num2 = s.nextFloat();
			
			result = num1 - num2;
			
			System.out.println("The Difference Is: " + result);
		}
		else if(operator == 3) {
			System.out.print("Enter First Number: ");
			num1 = s.nextFloat();
			System.out.print("Enter Second Number: ");
			num2 = s.nextFloat();
			
			result = num1 * num2;
			
			System.out.println("The Product Is: " + result);
		}
		else if(operator == 4) {
			System.out.print("Enter First Number: ");
			num1 = s.nextFloat();
			System.out.print("Enter Second Number: ");
			num2 = s.nextFloat();
			
			result = num1 / num2;
			
			System.out.println("The Quotient Is: " + result);
		}
		else {
			System.out.println("INVALID CHOICE! PLEASE CHOOSE A VALID NUMBER!");
		}
		
		

	}

}
