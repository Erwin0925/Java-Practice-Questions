package Lambda_Expression;

// Write a Java program to implement a lambda expression to find the sum of two integers.
//-----------------------------------------------------------------------------------//

public class question25 {
    public void SumOfTwoIntegers() {
        Sum sum = (a, b) -> a + b;
        System.out.println(sum.add(10, 20));
    }

    interface Sum {
        int add(int a, int b);
    }
}
