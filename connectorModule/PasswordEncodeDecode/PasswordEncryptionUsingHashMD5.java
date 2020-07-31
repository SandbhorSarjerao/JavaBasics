package PasswordEncodeDecode;

import java.util.Scanner;
import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptionUsingHashMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner input = new Scanner(System.in);
		String userName, password;
		String algorithm = "MD5";

		System.out.print("Enter Username: ");
		userName = input.nextLine();

		System.out.print("Enter Password: ");
		password = input.nextLine();

		System.out.println("MD5 UserName: " + generateHash(userName, algorithm));
		// System.out.println("Decode UserName: " +
		// decryptPassword(encryptPassword(userName)));

		System.out.println("MD5 UserName: " + generateHash(password, algorithm));
		// System.out.println("Decode Password: " +
		// decryptPassword(encryptPassword(password)));

	}

	private static String generateHash(String userName, String algorithm) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance(algorithm);
		digest.reset();
		byte[] hash = digest.digest(userName.getBytes());
		return bytesToStringHex(hash);
	}

	private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

	public static String bytesToStringHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}
