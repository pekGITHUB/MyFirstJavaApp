package chapter4exercises;

public class CalcAreaLegal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short c = 7;
		long t = 42;
		
		int a = calcArea(7,12);      // answer was 84
//		int a = calcArea(c,15);      answer was 105
//		int a = calcArea(57);        compile error on arguments -- should be two
//      int a = calcArea(2,3);		 answer was 6
//      int a = calcArea(t,17);      compile error on arguments -- methond not applicable for (long, int)     
//      int a = calcArea();          compile error on arguments -- methond not applicable for () 
//      byte a = calcArea(4,20);     compile error Type mismatch: cannot convert from int to byte
//      int a = calcArea(2,3,5);     compile error on arguments -- methond not applicable for (int,int,int)
		
		System.out.println("Answer is " + a);
	}
		
	public static int calcArea(int height, int width) {
	    return height * width;
		}		

}
