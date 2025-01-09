package Problem_Solving;

// Write a Java program to check if an array of integers contains three increasing adjacent numbers.
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class question9 {
    public void CheckIncreasingAdjacentNumbers(){
        int num [] = new int[4];
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            num[0] = input.nextInt();
            System.out.print("Enter the second number: ");
            num[1] = input.nextInt();
            System.out.print("Enter the third number: ");
            num[2] = input.nextInt();
            System.out.print("Enter the forth number: ");
            num[3] = input.nextInt();

            String result ="No";
            for (int i = 0; i < num.length-2; i++) {
                if ((num[i]+1 == num[i+1]) && (num[i+1]+1 == num[i+2])){
                    result = "Yes";
                    break;
                }else{
                    result = "No";
                }
            }

            System.out.print(result);

        }catch(Exception e){
            System.out.println("Enter a valid input");
        }
    }
}
