package Day10Exercises;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString1 = "java";
		String inputString2 = "code";
		String resultString = "";
		
		resultString = nonStart(inputString1, inputString2);
		
		System.out.println(inputString1 + " concantenated to " + inputString2 + " is " + resultString);
	}

	public static String nonStart(String a, String b) {
		String concatString = "";
		
		concatString = a.substring(1, a.length()) + b.substring(1, b.length());
	
		return concatString;
		
	}
}
