package Stream_Method;

// Write a Java program to convert a list of strings to uppercase or lowercase using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question49 {
    public void ConvertString() {
        List<String> words = Arrays.asList("Red", "Black", "White", "Orange", "Blue");

        List <String> upper = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        List <String> lower = words.stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println(upper);
        System.out.println(lower);
    }
}
