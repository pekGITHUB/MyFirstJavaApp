package Day7Exercises;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b;
    
	System.out.println("Enter two integers representing temperature");
	Scanner in = new Scanner(System.in);
	a = in.nextInt();
	b = in.nextInt();
	
	if (icyHot(a,b)) {
		System.out.println("True");
	} else {
        System.out.println("False");
	}
	
}
	
	public static boolean icyHot(int a, int b) {
		if ((a < 0) && (b > 100)) {
			return true;
		} else {
			if ((a > 100) && (b < 0)) {
				return true;
			} else {
				return false;
			}

		}
	}


}
