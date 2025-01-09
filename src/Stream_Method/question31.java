package Stream_Method;

// Write a Java program to implement stream to remove duplicates from a list of integers.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question31 {

    public void RemoveDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2);
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
