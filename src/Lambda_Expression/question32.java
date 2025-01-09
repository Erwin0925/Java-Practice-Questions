package Lambda_Expression;

// Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
//-----------------------------------------------------------------------------------//

import java.util.function.LongUnaryOperator;

public class question32 {
    public void Factorial() {
        LongUnaryOperator factorial = n ->{
            long result =1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.applyAsLong(5));
    }
}
