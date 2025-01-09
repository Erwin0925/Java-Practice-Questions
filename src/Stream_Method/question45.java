package Stream_Method;

//Write a Java program that implement Stream to check if a list of strings are all uppercase or all lowercase or mixedcase
//-----------------------------------------------------------------------------------//

import java.util.stream.Stream;

public class question45 {
    public void CheckCase() {
        String[] str = { "MADAM", "HELLO", "WORLD" };
        boolean isAllUpperCase = Stream.of(str).allMatch(s -> s.equals(s.toUpperCase()));
        boolean isAllLowerCase = Stream.of(str).allMatch(s -> s.equals(s.toLowerCase()));
        boolean isMixedCase = !isAllUpperCase && !isAllLowerCase;
        if (isAllUpperCase) {
            System.out.println("All strings are in uppercase");
        } else if (isAllLowerCase) {
            System.out.println("All strings are in lowercase");
        } else if (isMixedCase) {
            System.out.println("Strings are in mixed case");
        }
    }
}