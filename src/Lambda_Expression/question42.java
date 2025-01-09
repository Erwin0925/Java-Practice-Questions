package Lambda_Expression;

// Write a Java program to implement a lambda expression to check if a given number is a perfect square.
//-----------------------------------------------------------------------------------//

import java.util.function.Predicate;

public class question42 {

    public void CheckPerfectSquare() {
        Predicate<Integer> checkPerfectSquare = num -> {
            int sqrnum = (int) Math.sqrt(num);
            return (sqrnum * sqrnum) == num;
        };

        System.out.println(checkPerfectSquare.test(9));
        System.out.println(checkPerfectSquare.test(6));
    }
}