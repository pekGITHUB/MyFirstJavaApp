package Day8Exercises;

import java.util.Scanner;

public class FirstTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String InputString = "";
		String Result = "";
		
		System.out.println("Please enter a string of values or just hit enter to enter nothing");
        Scanner in = new Scanner(System.in);
        InputString = in.nextLine();
        
        
        if (InputString.length() == 0) {
			System.out.println("No String was entered - try again with a string value");
		} else {
			if (InputString.length() == 1) {
				System.out.println(InputString.charAt(0));
			} else {
				System.out.print(InputString.charAt(0));
				System.out.println(InputString.charAt(1));
			}
		}
        
        }

}
