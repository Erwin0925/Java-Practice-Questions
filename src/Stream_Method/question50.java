package Stream_Method;

//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
//-----------------------------------------------------------------------------------//

public class question50 {
    public void SumOfEvenOdd() {
        java.util.List<Integer> nums = java.util.Arrays.asList(1,2,3,4,5);

        int evenSum = nums.stream()
                .filter(num -> num%2 ==0)
                .reduce(0, (x, y)-> x + y);

        int oddSum = nums.stream()
                .filter(num -> num%2 !=0)
                .reduce(0, (x, y)-> x + y);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

}
