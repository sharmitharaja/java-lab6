import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample3 {
    public static void main(String[] args) {
        // Create a HashMap to store cricketer names and their scores
        HashMap<String, Integer> cricketers = new HashMap<>();

        // Add cricketers and their scores
        cricketers.put("Virat ", 122);
        cricketers.put("Rohit Sharma", 140);
        cricketers.put("SKY", 75);
		cricketers.put("Hardik",78);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the batsman's name to search for his score: ");
        String name = scanner.nextLine();

        // Search for the batsman's score
        if (cricketers.containsKey(name)) {
            System.out.println(name + "'s score: " + cricketers.get(name));
        } else {
            System.out.println("Batsman not found.");
        }

        scanner.close();
    }
}
