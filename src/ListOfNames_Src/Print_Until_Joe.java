package ListOfNames_Src;

public class Print_Until_Joe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] LisOfNames = {"tracy","doe","bob","joe","sam"};
		int y = LisOfNames.length;
		
		for(int i=0; i<y; i++) {
//			if (LisOfNames[i].toUpperCase().equals("JOE")) {
//                System.out.println("This is JOE");
//			}
			if (LisOfNames[i] == "joe") {
				break;
			} else {
                System.out.println(LisOfNames[i]);
			}
		
					
		}
    System.out.println("End of program");
	}

}
