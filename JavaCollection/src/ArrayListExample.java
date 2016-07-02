import java.util.*;

public class ArrayListExample {
	public static void main(String args[]){
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Karim");
		arr.add("Rahim");
		arr.add("Jamil");
		System.out.println("Currently Array list:"+arr);
		
		arr.add(0,"Muhin");
		arr.add(3,"Arif");
		System.out.println("Currently Array list:"+arr);
		
		arr.remove("Rahim");
		System.out.println("Currently Array list:"+arr);
        arr.remove(0);		
        System.out.println("Currently Array list:"+arr);
        String str=arr.get(2);
        System.out.println("Expected item is:"+str);
        
        ArrayList<Integer> arrint=new ArrayList<Integer>();
        arrint.add(100);
        arrint.add(150);
        arrint.add(200);
        arrint.add(250);
        System.out.println("Current Interger ArrayList"+arrint);
        arrint.add(1,120);
        System.out.println("Current Interger ArrayList"+arrint);
        
        int pos =arrint.indexOf(120);
        System.out.println("Current Interger ArrayList"+pos);
        System.out.println("Size is:"+arrint.size());
        
	}

}
