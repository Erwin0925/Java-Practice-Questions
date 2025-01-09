package HashMap;

//  Find the first non-repeating character in a string.
import java.util.HashMap;

public class question3 {

    public void GetFirstNonRepeatingChar(){

        String str = "SWISS";

        String[] words = str.split("");

        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print("The Character is: ");
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}
