package Day6Exercises;

import java.util.Scanner;

public class ParrotTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isparrottalking = false;
		int hour = 0;
		System.out.println("Is Parrot Talking? (Enter true or false)");
		Scanner in = new Scanner(System.in);
		isparrottalking = in.nextBoolean();
		System.out.println("What hour is it now? (Enter nbr between 0 and 23)");
		Scanner inhour = new Scanner(System.in);
		hour = in.nextInt();

        
        System.out.println("parrotTrouble(" + isparrottalking + "," + hour + ") -> " + 
        parrotTrouble(isparrottalking,hour));
	}

	public static boolean parrotTrouble(boolean pt, int hr) {
		if (pt){
			if ((hr < 7) || (hr > 20)){
				return true;
			} else {
				return false;
			} 
		} else {
          return false;
		}
	}
	
}
