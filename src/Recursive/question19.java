package Recursive;

// Write a Java recursive method to find the sum of all odd numbers in an array.
//-----------------------------------------------------------------------------------//

public class question19 {
    public void SumOfOddNumbers() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfOddNumbers(arr, 0));
    }

    public int sumOfOddNumbers(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        if (arr[index] % 2 != 0) {
            return arr[index] + sumOfOddNumbers(arr, index + 1);
        }
        return sumOfOddNumbers(arr, index + 1);
    }
}
