package com.revature;

import java.util.Scanner;

public class DecimalToOctal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Decimal number: ");
		int decimal = scanner.nextInt();
		StringBuilder octal = new StringBuilder("");
		
		// Repeatedly divide decimal by 8 and put remainder in highest place.
		while (decimal != 0) {
			
			int dividedDecimal = decimal / 8;
			int remainder = decimal % 8;
			
			octal.insert(0, remainder);
			
			decimal = dividedDecimal;
			
		}
		
		System.out.print("Octal number: ");
		System.out.println(octal);
		scanner.close();
		
	}

}
