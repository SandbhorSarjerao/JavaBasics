package PasswordEncodeDecode;

import java.util.Scanner;
import java.util.Base64;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptionUsing_HashMD5_SHA1 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner input = new Scanner(System.in);
		String userName, password;

		System.out.print("Enter Username: ");
		userName = input.nextLine();

		System.out.print("Enter Password: ");
		password = input.nextLine();

		System.out.println("MD5 UserName: " + generateHashMD5(userName));
		// System.out.println("Decode UserName: " +
		// decryptPassword(encryptPassword(userName)));

		System.out.println("MD5 Password: " + generateHashMD5(password));
		// System.out.println("Decode Password: " +
		// decryptPassword(encryptPassword(password)));

		System.out.println("MD5 UserName: " + generateHashSHA1(userName));
		System.out.println("MD5 Password: " + generateHashSHA1(password));

	}

	private static String generateHashMD5(String input) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		digest.reset();
		byte[] hash = digest.digest(input.getBytes());
		BigInteger number = new BigInteger(1, hash);
		String hashText = number.toString(16);
		while (hashText.length() < 32) {
			hashText = "0" + hashText;
		}
		return hashText;
	}

	private static String generateHashSHA1(String input) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA1");
		digest.reset();
		byte[] result = digest.digest(input.getBytes());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
}
