package Stream_Method;

// Write a Java program to using Stream to multiply and sum all elements in a list of integers.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class question35 {
    public void MultiplyAndSum() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        int product = nums.stream().reduce(1, (x, y)-> x*y);

        int sum = nums.stream().mapToInt(Integer::intValue).sum();

        System.out.println("The product is : " + product);
        System.out.println("The Sum is : " + sum);
    }
}
