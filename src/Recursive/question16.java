package Recursive;

// Write a Java recursive method to reverse a given string.
//-----------------------------------------------------------------------------------//

public class question16 {
    public void ReverseString() {
        String str = "madam";
        System.out.println(reverseString(str));
    }

    public String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
