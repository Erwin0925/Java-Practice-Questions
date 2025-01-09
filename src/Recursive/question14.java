package Recursive;

//Write a Java recursive method to calculate the nth Fibonacci number.
//-----------------------------------------------------------------------------------//

public class question14 {

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void getFibonacci() {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
}
