package Day5Exercises;

import java.util.Scanner;

public class GreatestOf3Nbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] GreatArray = {8,10,7};
       int x = Integer.MIN_VALUE;
       
       for (int i = 0; i < GreatArray.length; i++) {
    	   if (GreatArray[i] > x) {
			x = GreatArray[i];
		}
       }
       
       System.out.println("Greatest array value is " + x);   
	}

}
