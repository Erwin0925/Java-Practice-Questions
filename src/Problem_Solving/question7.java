package Problem_Solving;

// Write a Java program to reverse a word.
//-----------------------------------------------------------------------------------//
// Sample Output:
// Input a word: dsaf
// Reverse word: fasd
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class question7 {

    public void ReverseWord(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a word :");
            String word = input.next();
            String newword = "";

            for (int i = 0; i < word.length(); i++) {
                newword = word.charAt(i) + newword;
            }

            System.out.print(newword);
        }catch(Exception e){
            System.out.println("Enter a valid input");
        }
    }
}
