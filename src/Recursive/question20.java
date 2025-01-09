package Recursive;

// Write a Java recursive method to find the length of a given string.
//-----------------------------------------------------------------------------------//

public class question20 {
    public void LengthOfString() {
        String str = "madam";
        System.out.println(lengthOfString(str));
    }

    public int lengthOfString(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + lengthOfString(str.substring(1));
    }
}
