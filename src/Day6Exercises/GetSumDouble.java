package Day6Exercises;

public class GetSumDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println(sumDouble(1,2));
	    System.out.println(sumDouble(3,2));
	    System.out.println(sumDouble(2,2));
	}

	public static int sumDouble (int a, int b) {
	    int c = 0;
	     
	    if (a == b) {
			c = (a + b) * 2;
		} else {
            c = a + b;
		}
	    
	    return c;
	}
}
