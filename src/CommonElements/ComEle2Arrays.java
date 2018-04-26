package CommonElements;

public class ComEle2Arrays {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		int[] Numbers1 = {10,8,12,15,72,43,60,100,1,11,17};
		int[] Numbers2 = {5,10,1,3,65,156,43,8,73,99,12};
		
		int x = 0;
		
		while (x < Numbers1.length) {
			for (int i = 0; i < Numbers2.length; i++) {
				if (Numbers1[x] == Numbers2[i]) {
					System.out.println("Common Element is " + Numbers2[i]);
				} 
			}
			x++;
		}
			

	}

}
