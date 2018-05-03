package Day5Exercises;

import java.util.Scanner;

public class PosNegInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		System.out.println("Enter an integer");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if (x > 0) {
			System.out.println(x + " is a positive integer");
			
		} else {
			if (x < 0) {
				System.out.println(x + " is a negative integer");
			} else {
				if (x == 0) {
					System.out.println("Integer entered was 0");	
				} else {
                    System.out.println("Please enter a valid integer value");
				}
				
			}
		}

	}
}