package Recursive;

// Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
//-----------------------------------------------------------------------------------//

public class question17 {
    public void GCD() {
        int num1 = 12;
        int num2 = 18;
        System.out.println(gcd(num1, num2));
    }

    public int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
