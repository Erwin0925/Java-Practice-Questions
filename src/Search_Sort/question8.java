package Search_Sort;

// BubbleSort
// Write a Java program to rearrange all the elements of a given array of integers
// so that all the odd numbers come before all the even numbers.
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class question8 {
    public void SortOddEven(){
        try (Scanner input = new Scanner(System.in)) {
            int num[] = new int[4];

            System.out.print("Plese enter integer 1: ");
            num[0] = input.nextInt();
            System.out.print("Plese enter integer 2: ");
            num[1] = input.nextInt();
            System.out.print("Plese enter integer 3: ");
            num[2] = input.nextInt();
            System.out.print("Plese enter integer 4: ");
            num[3] = input.nextInt();

            for (int i = 0; i < num.length-1; i++) {
                for (int j = 0; j < num.length-1-i; j++) {
                    if((num[j]%2 < num[j+1]%2) || (num[j]%2 == num[j+1]%2 && num[j]> num[j+1])){
                        int temp = num[j];
                        num[j] = num[j+1];
                        num[j+1] = temp;
                    }
                }
            }

            for(int number : num){
                System.out.print(number + " ");
            }
        }catch(Exception e){
            System.out.println("Enter a valid input");
        }
    }
}
