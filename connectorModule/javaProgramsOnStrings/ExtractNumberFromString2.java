package javaProgramsOnStrings;

public class ExtractNumberFromString2 {

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		
		int len = cs.length();
		String num = "";
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(cs.charAt(i))) {
				num = num + cs.charAt(i);
			} else if (Character.isAlphabetic(cs.charAt(i))) {
				continue;
			}/*else if (!Character.isDigit(cs.charAt(i))) {
				return false;
			}*/
		}
		System.out.println("Number is : " + num);

		return true;
	}

	public static void main(String[] args) {
		// System.out.println(isNumeric(null));
		// System.out.println(isNumeric(""));
		// System.out.println(isNumeric(" "));
		// System.out.println(isNumeric("555"));
		System.out.println(isNumeric("abc"));
		// System.out.println(isNumeric("111 Error"));
		// System.out.println(isNumeric("Error 222"));
		// System.out.println(isNumeric("333Error"));
		// System.out.println(isNumeric("Error444"));
		// System.out.println(isNumeric("555 Error on 3rd Page"));
		// System.out.println(isNumeric("Error 666 on 3rd page"));
	}
}
