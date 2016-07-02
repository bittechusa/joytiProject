import java.util.*;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		ArrayList<String> myList =new ArrayList<String>();
		myList.add("ratul");
		List<String> newK =new LinkedList<String>(myList);
		System.out.println(newK);

	}

}
