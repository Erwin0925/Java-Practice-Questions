package Recursive;

// Write a Java recursive method to calculate the product of all numbers in an array.
//-----------------------------------------------------------------------------------//

public class question23 {
    public void ProductOfAllNumbers() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(productOfAllNumbers(arr, 0));
    }

    public int productOfAllNumbers(int[] arr, int index) {
        if (index == arr.length) {
            return 1;
        }
        return arr[index] * productOfAllNumbers(arr, index + 1);
    }
}
