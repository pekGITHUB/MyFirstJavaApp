package ArrayByLoc;

import java.util.Scanner;

public class ArrayByLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Numbers = {10,8,12,15,72,43,60,100,1,11,17};
		
		int x;
		
		System.out.println("Enter array location or index number");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if ((x >= 0) && (x < Numbers.length)) {
			System.out.println("Array value is " + Numbers[x] + " in location " + x);
		} 
		else {
			System.out.println("Please enter a location number from 0 to " + (Numbers.length - 1));
		}
	
		
	}

}
