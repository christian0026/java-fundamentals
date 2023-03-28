package javaFundamentals;

import java.util.Scanner;

public class activity {

	public static void main(String[] args) {
		
		Scanner scanme = new Scanner(System.in);
		
		String firstName, lastName, contactNumber, address, email, date;
		
		System.out.print("First Name: ");
		firstName = scanme.nextLine();
		
		System.out.print("Last Name: ");
		lastName = scanme.nextLine();
		
		System.out.print("Contact Number: ");
		contactNumber = scanme.nextLine();
		
		System.out.print("Address: ");
		address = scanme.nextLine();
		
		System.out.print("Email Address: ");
		email = scanme.nextLine();
		
		System.out.print("Date: ");
		date = scanme.nextLine();
		
		System.out.println("First Name: " + firstName + " Last Name: " + lastName + " Contact Number: " + contactNumber + " Address: " + address + " Email Address: " + email + " Date: " + date);

	}

}
