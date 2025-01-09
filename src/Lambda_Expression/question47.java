package Lambda_Expression;

// Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
//-----------------------------------------------------------------------------------//

import java.util.function.UnaryOperator;

public class question47 {

    public void LargestPrimeFactor() {
        UnaryOperator<Integer> getLargestPrimeFactor = num -> {
            for (int i = (int) Math.sqrt(num); i > 2; i--) {
                if (num % i == 0 && isPrime(i)) {
                    return i;
                }
            }
            return isPrime(num) ? num : null;
        };

        System.out.println(getLargestPrimeFactor.apply(176));
    }

    public boolean isPrime(int num){
        if(num<2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
