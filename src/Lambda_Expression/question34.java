package Lambda_Expression;

// Write a Java program to implement a lambda expression to concatenate two strings.
//-----------------------------------------------------------------------------------//

public class question34 {
    public void ConcatenateStrings() {
        Concatenate concatenate = (str1, str2) -> str1 + str2;
        System.out.println(concatenate.concat("Hello", "World"));
    }

    interface Concatenate {
        String concat(String str1, String str2);
    }
}
