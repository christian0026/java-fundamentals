package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float english, math, science, computer, average;
		
		System.out.print("English: ");
		english = s.nextFloat();

		System.out.print("Math: ");
		math = s.nextFloat();
		
		System.out.print("Science: ");
		science = s.nextFloat();
		
		System.out.print("Computer: ");
		computer = s.nextFloat();
		
		average = (english + math + science + computer)/4;
		
		System.out.println();
		System.out.println("Average: " + average);
		
		if(average > 100) {
			System.out.println("Invalid Grade");
		}
		else if(average >= 98) {
			System.out.println("With Highest Honors");
		}
		else if(average >= 95) {
			System.out.println("With High Honors");
		}
		else if(average >= 90) {
			System.out.println("With Honors");
		}
		else if(average >= 75) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		

	}

}
