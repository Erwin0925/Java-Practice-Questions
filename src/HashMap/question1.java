package HashMap;

// Count the frequency of each word in a string using HashMap.
import java.util.HashMap;

public class question1 {

    public void CountWords(){

        String str = "This is a test. This test is only a test";

        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
