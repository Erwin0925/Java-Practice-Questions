package Lambda_Expression;

// Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
//-----------------------------------------------------------------------------------//

public class question44 {
    public void SumOfPrimeNumbers() {
        Sum sum = (start, end) -> {
            int sumOfPrimeNumbers = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sumOfPrimeNumbers += i;
                }
            }
            return sumOfPrimeNumbers;
        };
        System.out.println(sum.add(1, 10));
    }

    interface Sum {
        int add(int start, int end);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
