package Lambda_Expression;

// Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class question29 {
    public void SortString() {
        List<String> str = Arrays.asList("John","Apple","Zebra","Banana");
        str.forEach(item -> System.out.print(item + " "));

        str.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
    }
}
