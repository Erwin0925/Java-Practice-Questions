package Lambda_Expression;

// Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
//-----------------------------------------------------------------------------------//

public class question28 {
    public void FilterEvenOdd() {
        Filter filter = (arr) -> {
            String result = "";
            for (int i : arr) {
                if (i % 2 == 0) {
                    result += i + " ";
                }
            }
            return result;
        };
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(filter.filter(arr));
    }

    interface Filter {
        String filter(int[] arr);
    }
}
