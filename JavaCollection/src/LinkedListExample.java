import java.util.*;
public class LinkedListExample {
	
	public static void main(String args[]){
		LinkedList<String> linkList=new LinkedList<String>();
		//Add country name into linklist
		linkList.add("Bangladesh");
		linkList.addLast("India");
		linkList.add("Pakistan");
		linkList.add("SriLanka");
		linkList.add("Maldip");
		linkList.add("Bhutan");
		
		System.out.println("Countries are in LinkedList:"+linkList);
		
		linkList.addFirst("America");
		linkList.addLast("England");
		
		System.out.println("After adding LinkedList items are:"+linkList);
		linkList.remove(2);
		linkList.remove(2);
		System.out.println("After deletion items are:"+linkList);
		//linkList.removeLast();
		linkList.set(4,"Nepal");
		System.out.println("Items are:"+linkList);
        linkList.contains("ghdgfh");
        //System.out.println("Item is:"+linkList.get(3));
        
        Object first_element=linkList.getFirst();
        Object last_element=linkList.getLast();
        
        System.out.println("First Element is:"+first_element);
        System.out.println("Last Element is:"+last_element);
        	
	}

}
