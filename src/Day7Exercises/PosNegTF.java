package Day7Exercises;

import java.util.Scanner;

public class PosNegTF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a,b;
	    String c;
	    boolean d;
	    
		System.out.println("Enter two integers and the negative parameter as either T or F for True or False");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.next();	
		
		if (c == "T") {
			d = true;
		} else {
	        d = false;
		}
	
		System.out.println(c + d);
	}
	
		
//		public static boolean icyHot(int a, int b, boolean d) {
//			if ((a < 0) && (b > 100)) {
//				return true;
//			} else {
//				if ((a > 100) && (b < 0)) {
//					return true;
//				} else {
//					return false;
//				}
//
//			}
//	}

}
