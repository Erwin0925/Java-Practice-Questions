package Stream_Method;

// Write a Java program to remove all duplicate elements from a list using streams.
//-----------------------------------------------------------------------------------//

public class question51 {
    public void RemoveDuplicates() {
        java.util.List<Integer> list = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2);
        java.util.List<Integer> uniqueList = list.stream().distinct().collect(java.util.stream.Collectors.toList());
        System.out.println(uniqueList);
    }
}
