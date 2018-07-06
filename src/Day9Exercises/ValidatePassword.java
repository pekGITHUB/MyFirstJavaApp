package Day9Exercises;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String InputPasswordString = "";
		Boolean Result = false; 
		
		System.out.println("Please enter a valid Password");
        Scanner in = new Scanner(System.in);
        InputPasswordString = in.nextLine();
        
        Result = validatePswd(InputPasswordString);
        
      
	}

	public static boolean validatePswd(String a) {
		return true;
	
	}
	}
	
}
