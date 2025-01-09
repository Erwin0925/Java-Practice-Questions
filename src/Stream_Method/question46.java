package Stream_Method;

// Write a Java program that implement Stream to find the average length of strings in a list.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class question46 {
    public void AverageLength() {
        List<String> words = Arrays.asList("Red", "Black", "White", "Orange", "Blue");

        double avg = words.stream().mapToInt(String::length).average().getAsDouble();

        System.out.println(avg);
    }
}
