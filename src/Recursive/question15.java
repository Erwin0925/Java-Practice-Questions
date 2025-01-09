package Recursive;

// Write a Java recursive method to check if a given string is a palindrome.
// Palindrome :  word, phrase, number, or any sequence of characters that reads the same backward as forward.
//            :  madam", "racecar", "level", "radar"
//-----------------------------------------------------------------------------------//

public class question15 {
    public void CheckPalindrome() {
        String str = "madam";
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}
