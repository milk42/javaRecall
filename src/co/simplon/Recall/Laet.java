package co.simplon.Recall;

import java.util.ArrayList;

public class Laet {

	public static String helloWorld(String name) {

		String message;
		//message = name == "" ? "Hello World" : "Hello " + name;
		if (name == "") {
			message = "Hello World";
		}
		else {
			message = "Hello " + name;
			
		}
		return message;
	}

}


public static String[] removeNullElements(String array[]) {
	
	ArrayList<String> arrayOut = new ArrayList<String>();
	
	
		for ( int i = 0; i < array.length; i++) {
			
			String element = array[i];
			if (element != null)
				arrayOut.add(element);
			System.out.println(arrayOut);
				
		}
		String tab [] = new String[arrayOut.size()];
			for (int i = 0; i < tab.length; i++) {
				
			}
		return tab;
		
		
		//return  arrayOut.toArray(tab);
	
		//for(int i = 0; i < array.length; i++) {
			
					 //if (array[i] == null){  
						 
						 //arrayOut.remove(i);//i.remove(); 
						
					//}
					
				//}
		 //return arrayOut;	
				
	//public void removeNullElements() {
		//String arrayIn[] = { "a", "b", null, null, "false", "null" };
		//String arrayOut[] = { "a", "b", "false", "null" };
		//assertArrayEquals(arrayOut, PlayingWithAlgo.removeNullElements(arrayIn));
}