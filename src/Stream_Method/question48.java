package Stream_Method;

// Write a Java program to calculate the average of a list of integers using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class question48 {
    public void Average() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        double average = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println("The average is : " + average);
    }
}
