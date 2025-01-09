package Stream_Method;

// Write a Java program that implement Stream to calculate the sum of squares of all odd and even numbers in a list.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class question38 {
    public void SumOfSquares() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        int sum = nums.stream().reduce(0, (x, y)-> x + (y * y));

        int evenSum = nums.stream()
                .filter(num -> num%2 ==0)
                .reduce(0, (x, y)-> x + (y * y));

        int oddSum = nums.stream()
                .filter(num -> num%2 ==0)
                .reduce(0, (x, y)-> x + (y * y));

        System.out.println(sum);
        System.out.println(evenSum);
    }
}
