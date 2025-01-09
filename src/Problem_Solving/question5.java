package Problem_Solving;

// Write a Java program to capitalize the first letter of each word in a sentence.
//-----------------------------------------------------------------------------------//
// Sample Output:
// Input a Sentence: the quick brown fox jumps over the lazy dog.
// The Quick Brown Fox Jumps Over The Lazy Dog.
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class question5 {

    private void FirstWordCapital(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a poem in all small letter :");
            String name = input.nextLine();

            var name2 = name.split(" ");

            System.out.print(capitalize(name2));
        }catch(Exception e){
            System.out.println("Enter a valid input");
        }
    }

    private String capitalize(String[] name2){

        StringBuilder result = new StringBuilder();

        for(var name4 : name2){
            result.append(name4.substring(0,1).toUpperCase().concat(name4.substring(1) + " "));
        }

        return result.toString().trim();
    }
}
