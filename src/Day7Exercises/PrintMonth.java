package Day7Exercises;

import java.util.Scanner;

public class PrintMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
     String[] MonthArray = {       null,
    		                       "January",
								   "February",
								   "March",
								   "April",
								   "May",
								   "June",
								   "July",
								   "August",
								   "September",
								   "October",
								   "November",
								   "December"};
	
		int x;
		System.out.println("Enter month number");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
        if ((x > 0) && (x < 13)){
		   System.out.println(x + " represents " + MonthArray[x]);
		} else {
			System.out.println("Please enter month number > 0 and < 13");
		}
        
	}

}
