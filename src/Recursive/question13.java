package Recursive;

// Write a Java recursive method to calculate the sum of all numbers from 1 to n.
//-----------------------------------------------------------------------------------//

public class question13 {

    public int sum(int num){
        if (num == 0){
            return 0;
        }
        return num + sum(num-1);
    }

    public void GetSum(){
        System.out.println(sum(5));
    }

}
