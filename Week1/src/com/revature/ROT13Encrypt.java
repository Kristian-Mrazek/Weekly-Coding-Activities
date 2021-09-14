package com.revature;

import java.util.Scanner;

public class ROT13Encrypt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder encryptedStr = new StringBuilder("");
		
		// Shift ASCII value by 13 for each letter character in String.
		// Non-letter characters remain unmodified.
		for (int i = 0; i < str.length(); i++) {
			
			int asciiValue = (int) str.charAt(i);
			int encryptedAsciiValue = asciiValue;
			
			// Check if character is an uppercase letter.
			if (asciiValue >= 65 && asciiValue <= 90) {
				encryptedAsciiValue += 13;
				
				if (encryptedAsciiValue > 90) {
					encryptedAsciiValue -= 26;
				}
			}
			
			// Check if character is a lowercase letter.
			if (asciiValue >= 97 && asciiValue <= 122) {
				encryptedAsciiValue += 13;
				
				if (encryptedAsciiValue > 122) {
					encryptedAsciiValue -= 26;
				}
			}
			
			encryptedStr.append((char) encryptedAsciiValue);
			
		}
		
		System.out.println(encryptedStr);
		scanner.close();
		
	}
	
}
