package javaProgramsOnStrings;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		
		String ten = "10";
		String nine = "nine";
		String s1 = "The Page not found 404 Error";
		String s2 = "The Server 500Error";
		
		// Using "Integer.valueOf()" method
		int int10 = Integer.valueOf(ten);
		System.out.println("Using Integer.valueOf() method: "+ int10);
		
		// Using "Integer.parseInt()" method
		int10 = Integer.parseInt(ten);
		System.out.println("Using Integer.parseInt() method: "+ int10);
		
		// Using "replaceAll()" method
		int ints1 = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
		System.out.println("Using Integer.parseInt(s1.replaceAll()) method: "+ ints1);
		
		int ints2 = Integer.parseInt(s2.replaceAll("[^0-9]", ""));
		System.out.println("Using Integer.parseInt(s1.replaceAll()) method: "+ ints2);

		// Using ASCII Value
		String ten1 = "101";
		int sum = 0;
		for(int i=0 ; i<ten1.length(); i++) {
			sum = sum * 10;
			sum = sum + (int)ten1.charAt(i) - (int)'0';
		}
		System.out.println("Numberic value of ten1 is :" + sum);
		
		int int9 = Integer.valueOf(nine);
		System.out.println("Using Integer.valueOf() method: "+ int9);
		
		int9 = Integer.parseInt(nine);
		System.out.println("Using Integer.parseInt() method: "+ int9);
	
	}
}
