package NumEvenOdd;

import java.util.Scanner;

public class ChkNumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = x % 2;
		if (y == 0) {
			System.out.println(x + " is an even number");
		} else {
            System.out.println(x + " is an odd number");
		}
		
        System.out.println("End of Program");
	}

}
