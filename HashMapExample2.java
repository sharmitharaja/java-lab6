package map2;
import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		//create hashmap
		HashMap<Integer,String>map=new HashMap<>();
		//check if the hashmap is empty
		if(map.isEmpty()) {
			System.out.println("The HashMap is Empty");
		}
		else {
			System.out.println("The HashMap is Not Empty:");
			
		}
		//add elements to the hashmap
		map.put(1, "Rahul");
		map.put(2, "Ajith");
		//check again
		if(map.isEmpty()) {
			System.out.println("The Hashmap is Empty");
		}
		else {
			System.out.println("The HashMap is Not Empty");
		}
			
	}

}
