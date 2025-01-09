package Stream_Method;

// Write a Java program that implement Stream to find the second largest and smallest element in an array.
//-----------------------------------------------------------------------------------//

public class question43 {
    public void SecondLargestAndSmallestElement() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int secondLargest = java.util.Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(arr.length - 2)
                .findFirst()
                .get();

        int secondSmallest = java.util.Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Largest Element: " + secondLargest);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}
