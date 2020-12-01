package javaProgramsOnStrings;

public class StringEqualsMethod {

	public static void main(String[] args) {
		String s1 = "Sarjerao";
		String s2 = "Sarjerao";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String str1 = new String("Sarjerao");
		String str2 = new String("Sarjerao");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}

}
