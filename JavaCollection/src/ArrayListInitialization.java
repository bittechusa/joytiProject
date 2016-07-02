import java.util.*;

public class ArrayListInitialization {
	public static void main(String args[]){
		
		//Method 1 implementation
		ArrayList<String> arrlist=new ArrayList<String>(Arrays.asList("Prodip", "Halim","Mostak"));
		System.out.println("Items are:"+arrlist);
	   
		//Method 2 implementation
		 ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
		  System.out.println("Content of Array list cities:"+cities);
	
	
	
	
	}

}
