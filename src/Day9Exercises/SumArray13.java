package Day9Exercises;

public class SumArray13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Input0 = {};
		int[] Input1 = {1,1};
		int[] Input2 = {1,2,2,1};
		int[] Input3 = {1,2,2,1,13};
		int[] Input4 = {1,13,4,4};
		int[] Input5 = {1,13,13,13,4,4};

		sum13(Input0);
		sum13(Input1);
		sum13(Input2);
		sum13(Input3);
		sum13(Input4);
		sum13(Input5);
		
		
		System.out.println("End of Program");
		
	}

	public static int sum13(int[] arrayOfInt) {
		boolean flag13 = false;
		int accumTotal = 0;
		
		for (int i = 0; i < arrayOfInt.length; i++) {
			if (arrayOfInt[i] == 13) {
				flag13 = true;
			} else {
				if (flag13) {
					flag13 = false;
				} else {
					accumTotal = accumTotal + arrayOfInt[i];
				}
			}
			
		}
	
		System.out.println("Total is " + accumTotal);
		return -1;
	}
}
