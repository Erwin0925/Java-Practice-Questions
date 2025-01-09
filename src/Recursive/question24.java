package Recursive;

// Write a Java recursive method to find the sum of the digits of a given integer.
//-----------------------------------------------------------------------------------//

public class question24 {
    public void SumOfDigits() {
        int num = 12345;
        System.out.println(sumOfDigits(num));
    }

    public int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
