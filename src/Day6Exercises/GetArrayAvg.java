package Day6Exercises;

public class GetArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] AvgArray = {90,7,15,27,8,5,13,127,10,6,21};
		   int ArrayValueTotal = 0;
		   float ArrayAverage = 0.00f;
	       
	       for (int i = 0; i < AvgArray.length; i++) {
	    	   ArrayValueTotal = ArrayValueTotal + AvgArray[i]; 
	       }
	       
	       ArrayAverage = (((float) ArrayValueTotal) / AvgArray.length);
	       
	       System.out.println("Average of Array Values is " + ArrayAverage); 
	       
		}
	}
