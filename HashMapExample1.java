import java.util.HashMap;
public class HashMapExample1{
public static void main(String args[]){
// create a hashmap
      HashMap<Integer,String>map=new HashMap<>();
//Associate key-value pairs
      map.put(1,"Car");
      map.put(2,"Bike");
      map.put(3,"Train");
//print the hashmap
System.out.println("HashMap:"+map);
}
}