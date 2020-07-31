package PasswordEncodeDecode;

import java.util.Scanner;
import java.util.Base64;

public class PasswordEncryptionUsingScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName, password;
		System.out.print("Enter Username: ");
		userName = input.nextLine();

		System.out.print("Enter Password: ");
		password = input.nextLine();

		System.out.println("Encode UserName: " + encryptPassword(userName));
        System.out.println("Decode UserName: " + decryptPassword(encryptPassword(userName)));
    
		System.out.println("Encode Password: " + encryptPassword(password));
        System.out.println("Decode Password: " + decryptPassword(encryptPassword(password)));
    
	}

	public static String encryptPassword(String password) {
		// Encode the Password
		byte[] ecodedPassword = Base64.getEncoder().encode(password.getBytes());
		return new String(ecodedPassword);
	}

	// Using java.util.Base64
	public static String decryptPassword(String encryptedPassword) {
		// Decode the Password
		byte[] decodePassword = Base64.getDecoder().decode(encryptedPassword);
		return new String(decodePassword);
	}

}
