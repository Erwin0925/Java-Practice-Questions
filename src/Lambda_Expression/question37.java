package Lambda_Expression;

// Write a Java program to implement a lambda expression to check if a given string is a palindrome.
//-----------------------------------------------------------------------------------//

public class question37 {
    public void CheckPalindrome() {
        CheckPalindrome checkPalindrome = (str) -> {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            return str.equals(reverse);
        };
        System.out.println(checkPalindrome.isPalindrome("madam"));
    }

    interface CheckPalindrome {
        boolean isPalindrome(String str);
    }
}
