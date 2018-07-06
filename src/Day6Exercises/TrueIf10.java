package Day6Exercises;

import java.util.Scanner;

public class TrueIf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("Enter two integers");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
        
        System.out.println("makes10(" + x + "," + y + ") -> " + makes10(x,y));
	}  
        
	
	public static boolean makes10(int x, int y) {
		if ((x == 10) || (y == 10)){
			return true; 
		} else {
          if ((x + y) == 10) {
			return true;
		} else {
			return false;
		}
		}
	}

}
