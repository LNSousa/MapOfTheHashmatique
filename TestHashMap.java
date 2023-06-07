import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();

        tracklist.put("Hello", "Hello");
        tracklist.put("Kill Bill", "Not the best idea");
        tracklist.put("Monster", "Everybody knows i'm a m******** monster.");
        tracklist.put("She", "I give two for us");

        System.out.println("Get lyrics for She:");
        System.out.println(tracklist.get("She"));

        System.out.println("\nTracklist:");
        Set<String> keys = tracklist.keySet();
        for(String key: keys) {
            System.out.printf("%s: %s%n", key, tracklist.get(key));
        }
    }
}