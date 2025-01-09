package Recursive;

// Write a Java recursive method to calculate the factorial of a given positive integer.
//-----------------------------------------------------------------------------------//

public class question12 {
    public int factorial(int num){
        if (num ==0){
            return 1;
        }
        return num * factorial(num-1);
    }

    public void FindFactorial(){
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
