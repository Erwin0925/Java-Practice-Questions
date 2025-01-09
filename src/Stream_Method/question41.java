package Stream_Method;

// Write a Java program that implement Stream to find the length of the longest and smallest string in a list
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class question41 {
    public void LengthOfString() {
        List<String> words = Arrays.asList("john","mary123","ali");

        int longestString = words.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        System.out.println(longestString);
    }
}
