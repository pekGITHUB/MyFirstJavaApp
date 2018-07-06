package Day8Exercises;

import java.util.Scanner;

public class FirstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String InputString = "";
		int i,x;
		
		
		System.out.println("Please enter an even numbered string of values");
        Scanner in = new Scanner(System.in);
        InputString = in.nextLine();
 
// does input string have an odd number of values or is input string empty?      
        if (((InputString.length() % 2) != 0) || (InputString.length() == 0)){
			System.out.println("Please enter a string with an even number of values");
		} else {
			i = 0;
			x = (InputString.length() / 2);
			while (i < x) {	
				System.out.print(InputString.charAt(i));
				i++;
			} 
		}
			
	}

}
