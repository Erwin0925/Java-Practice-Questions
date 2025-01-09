package HashMap;

// Check if two strings are anagrams using HashMap.

import java.util.HashMap;

public class question4 {

    public void CheckAnagrams(){
        String str1 = "listen";
        String str2 = "silent";

        Boolean result = Checker(str1, str2);
        System.out.println(str1 + " and " + str2 + " is anagrams ? : " + result);

    }

    public boolean Checker(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (char c : str1.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
