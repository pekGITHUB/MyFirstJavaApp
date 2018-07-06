package Day10Exercises;

import java.util.Scanner;

public class MultTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multInteger = 0;
		int numLen = 0;
		
		System.out.println("Enter an integer and number length for mult table");
		Scanner in = new Scanner(System.in);
		multInteger = in.nextInt();
		numLen = in.nextInt();

		multTable(multInteger, numLen);
		
		System.out.println("End of Program");
		
	}

	public static void multTable(int x, int b) {
		int y = 0;
		int c = 0;
		
		c = b + 1;
		
		while (y < c) {
			System.out.println(x + " X " + y + " = " + Math.multiplyExact(x, y));             
			y = y + 1;
		}

	}
}
