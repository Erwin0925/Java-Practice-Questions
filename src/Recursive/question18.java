package Recursive;

// Write a Java recursive method to count the number of occurrences of a specific element in an array.
//-----------------------------------------------------------------------------------//

public class question18 {
    public void CountOccurrences() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int element = 1;
        System.out.println(countOccurrences(arr, element, 0));
    }

    public int countOccurrences(int[] arr, int element, int index) {
        if (index == arr.length) {
            return 0;
        }
        if (arr[index] == element) {
            return 1 + countOccurrences(arr, element, index + 1);
        }
        return countOccurrences(arr, element, index + 1);
    }
}
