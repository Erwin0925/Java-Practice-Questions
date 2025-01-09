package Recursive;

// Write a Java recursive method to find the maximum element in an array.
//-----------------------------------------------------------------------------------//

public class question22 {
    public void MaximumElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maximumElement(arr, 0, arr[0]));
    }

    public int maximumElement(int[] arr, int index, int max) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return maximumElement(arr, index + 1, max);
    }
}
