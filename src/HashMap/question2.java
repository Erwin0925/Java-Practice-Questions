package HashMap;

//  Find the first non-repeating words in a string.
import java.util.HashMap;

public class question2 {

    public void GetFirstNonRepeatingWords(){

        String str = "This is a test. This test is only a test xial";

        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print("The words is: ");
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}
